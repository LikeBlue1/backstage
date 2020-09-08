package com.ysq.backstage.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName StudentInfoController
 * @Description TODO
 * @Author yangshaoqi
 * @Date 2020/9/8 16:21
 * @Version 1.0
 **/
@Controller
@RequestMapping("/studentinfo")
public class StudentInfoController {
    @RequestMapping("/list")
    public String index(){

        return "studentinfo/studentlist";
    }
}
