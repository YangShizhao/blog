package com.example.blog.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    /**
     * 测试函数
     * @param test 名称
     * @return 打招呼
     */
    @GetMapping(value = "hello")
    //@RequestMapping(value = "hello",method = RequestMethod.GET)
    public String test(@RequestParam(value = "name")String test) {
        return "Hello" + test;
    }

}
