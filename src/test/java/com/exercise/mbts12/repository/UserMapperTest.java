package com.exercise.mbts12.repository;

import com.exercise.mbts12.Mbts12Application;
import com.exercise.mbts12.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author wensiao
 * @create 2018-07-23 17:47
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Mbts12Application.class)

public class UserMapperTest {

    @Autowired
    private UserMapper userRepository;
    @Test
    public void deleteByPrimaryKey() {
        userRepository.deleteByPrimaryKey(4);
    }

    @Test
    public void selectByPrimaryKey() {
        try {
            User user = userRepository.selectByPrimaryKey(1);
            System.out.println(user.getName());
        }catch (Exception e){
            System.out.println(e);
        }

    }

    @Test
    public void insert() {
        User user = new User();
        user.setName("text");
        user.setSex("男");
        user.setAge(18);
        userRepository.insert(user);

    }

    @Test
    public void selectAll() {
        List<User> users = userRepository.selectAll();
        for(User user: users){
            System.out.println(user.toString());
        }
    }

    @Test
    public void updateByPrimaryKey() {
        User user = new User();
        user.setId(1);
        user.setName("进化 皮卡丘");
        user.setSex("男");
        user.setAge(20);
        userRepository.updateByPrimaryKey(user);
    }
}