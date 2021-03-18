package com.github.gudian1618.cgb2011yonghessm.dao;

import com.github.gudian1618.cgb2011yonghessm.pojo.Door;

import java.util.List;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/3/17 9:14 下午
 */

public interface DoorMapper {

    /**
     * 1.查询所有门店信息
     */
    public List<Door> findAll();

    /**
     * 2.根据id删除门店信息
     */
    public void deleteById(Integer id);

    /**
     * 3.新增门店信息
     */
    public void add(Door door);

    /**
     * 4.根据id查询门店信息
     */
    public Door findById(Integer id);

    /**
     * 5.根据id修改门店系信息
     */
    public void updateById(Door door);
}
