package com.ysq.backstage.mapper;

import com.ysq.backstage.model.CourseInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CourseMapper {

    public int findCountByMap(Map<String,Object> map);

    public List<CourseInfo> findListByMap(Map<String,Object> map);
}
