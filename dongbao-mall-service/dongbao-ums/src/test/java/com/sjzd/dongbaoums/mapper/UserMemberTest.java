package com.sjzd.dongbaoums.mapper;

import com.sjzd.dongbaoums.entity.UmsMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = com.sjzd.dongbaoums.UmsSpringBootApplication.class)
public class UserMemberTest {
    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Test
    void userMemberInsertTest() {
        UmsMember user = new UmsMember();
        user.setEmail("1111qq.com");
        user.setUsername("sjzd");
        user.setNickName("魁拔");
        user.setPassword("root");
        umsMemberMapper.insert(user);
    }
}
