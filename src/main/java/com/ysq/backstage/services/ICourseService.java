package com.ysq.backstage.services;

import com.ysq.backstage.model.CourseInfo;
import com.ysq.backstage.model.PageResult;

public interface ICourseService {

    public PageResult<CourseInfo> findPageResult(CourseInfo condition,int page,int pagesize);

    public void save(CourseInfo courseInfo);
}
