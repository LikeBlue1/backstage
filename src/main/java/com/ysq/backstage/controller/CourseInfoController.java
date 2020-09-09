package com.ysq.backstage.controller;

import com.ysq.backstage.model.CourseInfo;
import com.ysq.backstage.model.PageResult;
import com.ysq.backstage.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    ICourseService iCourseService;

    @RequestMapping("/list")
    public String index(){

        return "courseinfo/courselist";
    }

    @RequestMapping("/listjson")
    @ResponseBody
    public PageResult<CourseInfo> listJson(int page,int limit){
        PageResult<CourseInfo> pageResult = iCourseService.findPageResult(null,page,limit);

        return pageResult;
    }

}
