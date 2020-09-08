package com.ysq.backstage.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author yangshaoqi
 * @Date 2020/9/8 11:21
 * @Version 1.0
 **/
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){

        return "index";
    }
}
