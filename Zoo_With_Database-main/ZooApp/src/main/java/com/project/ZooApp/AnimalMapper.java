package com.project.ZooApp;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AnimalMapper {

    @Insert("INSERT INTO animal (name, zoneName, food) VALUES(#{name}, #{zoneName}, #{food})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Animal animal);

    @Select("SELECT id, name, zoneName, food FROM animal WHERE id = #{id}")
    Animal findById(long id);

    @Select("SELECT id, name, zoneName, food FROM animal")
    List<Animal> findAll();
}
