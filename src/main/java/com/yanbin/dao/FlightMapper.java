package com.yanbin.dao;

import com.yanbin.pojo.Flight;

import java.util.List;

public interface FlightMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Flight record);

    int insertSelective(Flight record);

    Flight selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Flight record);

    int updateByPrimaryKey(Flight record);

    //列表展示所有
    List<Flight> selectById();

    //根据id进行票价搜索查询
    List<Flight> selectByFlight();

}