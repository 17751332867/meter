package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MeterDao {
    @Update("update meter set value=#{value}")
    public void update(double value);
    @Select("select * from meter")
    public double get();

}
