package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.City;
import com.example.demo.mapper.MyBatisSampleCityMapper;

@RestController
public class DemoController {
	
	private final MyBatisSampleCityMapper cityMapper;
	public DemoController(MyBatisSampleCityMapper cityMapper) {
		this.cityMapper = cityMapper;
	}
	
    @RequestMapping(value="/sample", method=RequestMethod.GET)
    public City sample(@RequestParam(value="id", defaultValue="1") int id) {
    		return this.cityMapper.findByState(id);
    }
}
