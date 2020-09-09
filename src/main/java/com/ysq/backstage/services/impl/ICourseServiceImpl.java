package com.ysq.backstage.services.impl;

import com.ysq.backstage.mapper.CourseMapper;
import com.ysq.backstage.model.CourseInfo;
import com.ysq.backstage.model.PageResult;
import com.ysq.backstage.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ICourseServiceImpl
 * @Description TODO
 * @Author yangshaoqi
 * @Date 2020/9/9 8:08
 * @Version 1.0
 **/
@Service
public class ICourseServiceImpl implements ICourseService {

    @Autowired
    private CourseMapper courseMapper;


    @Override
    public PageResult<CourseInfo> findPageResult(CourseInfo condition, int page, int pagesize) {
        PageResult<CourseInfo> pageResult = new PageResult<CourseInfo>();
        pageResult.setCode(0);
        Map<String ,Object> map = new HashMap<>();
        map.put("start",(page-1) * pagesize);
        map.put("limit",pagesize);
        int countByMap = courseMapper.findCountByMap(map);
        pageResult.setCount(countByMap);
        List<CourseInfo> list = courseMapper.findListByMap(map);
        pageResult.setData(list);

        return pageResult;
    }
}
