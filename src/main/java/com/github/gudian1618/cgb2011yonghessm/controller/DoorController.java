package com.github.gudian1618.cgb2011yonghessm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/3/17 8:46 下午
 * 标识当前类的实例创建由spring容器负责
 */

@Controller
public class DoorController {

    @RequestMapping("/testmvc")
    public String testmvc() {
        System.out.println("springmvc的环境已经ok");
        return "test";
    }

}
