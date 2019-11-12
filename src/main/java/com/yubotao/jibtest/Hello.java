package com.yubotao.jibtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: yubotao
 * @Description:
 * @Date: Created in 16:01 2019/11/12
 * @Modified By:
 */
@RestController
public class Hello {

    @RequestMapping("/hello")
    public String hello(){
        return "hello, Jib!";
    }

}
