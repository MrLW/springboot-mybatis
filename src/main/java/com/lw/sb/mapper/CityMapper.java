package com.lw.sb.mapper;

import com.lw.sb.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by lw on 2017/4/18.
 */
@Mapper
public interface CityMapper {

    @Select("select * from dept where name = #{name}")
    Dept findByName(@Param("name")String name);
}
