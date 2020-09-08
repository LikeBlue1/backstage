package com.ysq.backstage.controller;

import com.ysq.backstage.model.CourseInfo;
import com.ysq.backstage.model.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/listjson")
    @ResponseBody
    public PageResult<CourseInfo> listJson(){
        PageResult<CourseInfo> pageResult = new PageResult<CourseInfo>();

        return pageResult;
    }

}
