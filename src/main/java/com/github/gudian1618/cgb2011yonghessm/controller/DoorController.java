package com.github.gudian1618.cgb2011yonghessm.controller;

import com.github.gudian1618.cgb2011yonghessm.dao.DoorMapper;
import com.github.gudian1618.cgb2011yonghessm.pojo.Door;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
