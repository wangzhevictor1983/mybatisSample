package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.City;

@Mapper
public interface MyBatisSampleCityMapper {
	@Select("SELECT * FROM MybatisSampleCity WHERE Id = #{id}")
	City findByState(@Param("id") int id);
}
