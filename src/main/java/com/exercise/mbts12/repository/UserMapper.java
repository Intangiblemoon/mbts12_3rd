package com.exercise.mbts12.repository;

import com.exercise.mbts12.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author IM
 */
@Repository
public interface UserMapper {

    @Delete("DELETE FROM `user` WHERE id = #{id}")
    int deleteByPrimaryKey(Integer id);

    @Insert("INSERT INTO `user` VALUES (#{id}, #{name}, #{sex}, #{age})")
    int insert(User record);

    @Select("select * from `user` where id = #{id,jdbcType=INTEGER}")
    User selectByPrimaryKey(Integer id);

    @Select("SELECT * FROM `user`")
    List<User> selectAll();

    @Update("UPDATE `user` SET name = #{name}, age = #{age}, sex = #{sex} WHERE id = #{id}")
    int updateByPrimaryKey(User record);
}