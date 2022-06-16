package com.cxxx.store.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cxxx.common.utils.PageUtils;
import com.cxxx.common.utils.Query;

import com.cxxx.store.product.dao.CategoryDao;
import com.cxxx.store.product.entity.CategoryEntity;
import com.cxxx.store.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {

        //查出所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //组装成父子的树结构

        //找到所有一级分类
        List<CategoryEntity> collect = categoryEntities.stream().filter(
                categoryEntity -> categoryEntity.getParentCid() == 0
//                new Predicate<CategoryEntity>() {
//                    @Override
//                    public boolean test(CategoryEntity categoryEntity) {
//                        //如果等于0  就返回true
//                        return categoryEntity.getParentCid()==0;
//                    }
//                }
        ).map((menu) -> {
            //把过滤的每一个等于0的菜单 映射给这个list然后返回
            menu.setChildren(getChildrens(menu, categoryEntities));
            return menu;
        }).sorted((m1, m2) -> {
            return (m1.getSort() == null ? 0 : m1.getSort()) - (m2.getSort() == null ? 0 : m2.getSort());
        }).collect(Collectors.toList());
        return collect;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
           //TODO 检查当前删除的菜单，是不是被别的地方引用



             baseMapper.deleteBatchIds(asList);
    }

    //递归查找所有一级菜单的子菜单   root是过滤出来的每一个等于父0的菜单
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> collect = all.stream().filter(categoryEntity -> {
            //找到自己id和父id匹配的 对象实体 返回
            //把所有的一级菜单的id（root.getCatId()）和 下级菜单的id对比   找一级菜单下面的子菜单
            return categoryEntity.getParentCid() == root.getCatId();
        }).map((menu) -> {
            //然后继续递归找到二级下面的菜单 重复filter操作      然后压栈把遍历出来的对象实例塞进vo
            //遍历的是all 全部的菜单 然后 传进来一个已经过滤出来的一级菜单  差
            menu.setChildren(getChildrens(menu, all));
            return menu;
        }).sorted((m1, m2) -> {
            return (m1.getSort() == null ? 0 : m1.getSort()) - (m2.getSort() == null ? 0 : m2.getSort());
        }).collect(Collectors.toList());
        return collect;
    }
}