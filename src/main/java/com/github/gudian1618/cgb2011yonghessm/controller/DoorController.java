package com.github.gudian1618.cgb2011yonghessm.controller;

import com.github.gudian1618.cgb2011yonghessm.dao.DoorMapper;
import com.github.gudian1618.cgb2011yonghessm.pojo.Door;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/3/17 8:46 下午
 * 标识当前类的实例创建由spring容器负责
 */

@Controller
public class DoorController {

    /**
     * 自动装配,根据当前变量的类型DooMapper到spring容器中,获取该接口对应的子类实例,将接口的子类实例赋值到doorMapper中
     */
    @Autowired
    private DoorMapper doorMapper;

    /**
     * 1.查询所有的门店信息
     */
    @RequestMapping("/doorList")
    public String doorList(Model model) {
        // 调用DoorMapper的finAll方法
        List<Door> list = doorMapper.findAll();
        // 将所有门店信息存入Model中,带到JSP中显示
        model.addAttribute("list", list);
        // 跳转到门店列表页面
        return "door_list";
    }

    /**
     * 2.根据id删除门店信息
     */
    @RequestMapping("/doorDelete")
    public String doorDelete(Integer id) {
        // 调用DoorMapper中的格局id删除门店信息的方法
        doorMapper.deleteById(id);
        // 跟新信息后,跳转到查询所有门店的方法,显示最新门店信息
        return "forward:/doorList";
    }

    /**
     * 3.新增门店信息
     */
    @RequestMapping("/doorAdd")
    public String doorAdd(Door door) {
        // 调用DoorMapper的新增门店的方法,新增一条门店信息
        doorMapper.add(door);
        // 更新门店信息后,跳转到查询所有门店的方法,显示最新门店信息
        return "forward:/doorList";
    }

    /**
     * 4.根据id查询门店信息
     */
    @RequestMapping("/doorInfo")
    public String doorInfo(Integer id, Model model) {
        Door door = doorMapper.findById(id);
        model.addAttribute("door", door);
        return "door_update";
    }

    /**
     * 5.根据查询出来的id修改门店信息
     */
    @RequestMapping("/doorUpdate")
    public String doorUpdate(Door door) {
        // 盗用DoorMapper的修改门店信息的方法,根据id查询最新的门店信息
        doorMapper.updateById(door);
        return "forward:/doorList";
    }

    /**
     * 通用的页面跳转方法
     * "/index",{}括号中的jspName的值就是index,将这个jspName的值传递给方法上的形参japName,
     * 方法上的形参再作为方法的返回值返回,也就是return返回的值,没写死,通用传输方法.
     * 通过jsp的名字作为访问路径,就可以跳转到指定目录下的jsp页面!
     */
    @RequestMapping("/{page}")
    public String toJsp(@PathVariable String page) {
        return page;
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }


    // =====================

    @RequestMapping("/testmvc")
    public String testmvc() {
        System.out.println("springmvc的环境已经ok");
        return "test";
    }

    /**
     * 测试ssm的开发环境
     */
    @RequestMapping("/testssm")
    public String testssm() {
        System.out.println("DoorController.testssm()...");
        // 查询所有门店信息
        List<Door> list = doorMapper.findAll();
        for (Door door : list) {
            System.out.println(door);
        }
        return "test";
    }

}
