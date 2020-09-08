package com.ysq.backstage.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName CourseController
 * @Description TODO
 * @Author yangshaoqi
 * @Date 2020/9/8 16:18
 * @Version 1.0
 **/
@Controller
@RequestMapping("/courseinfo")
public class CourseInfoController {
    @RequestMapping("/list")
    public String index(){

        return "courseinfo/courselist";
    }

}
