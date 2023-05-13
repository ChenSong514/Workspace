package com.joyful.code3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.joyful.code3.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Map;


@SpringBootTest
@Configuration
class RedisTest {

//    @Autowired
//    private RedisTemplate redisTemplate;
    @Autowired
    private  StringRedisTemplate stringRedisTemplate;
    private static  final ObjectMapper mapper=new ObjectMapper();
    @Test
    void testString() throws Exception {
        String joyful = mapper.writeValueAsString(new User("joyful", 42));
        stringRedisTemplate.opsForValue().set("user:0",joyful);
//        String str = stringRedisTemplate.opsForValue().get("user:200");
//        User user = mapper.readValue(str, User.class);
//        System.out.println(user);
    }

    @Test
    public void testSaveUser(){
//        redisTemplate.opsForValue().set("user:1",new User("joyful中国",42));
//        User obj =(User) redisTemplate.opsForValue().get("user:1");
//        System.out.println(obj.getName());
    }
    
    @Test
    public void testHash(){
        stringRedisTemplate.opsForHash().put("user:400","name","joyful");
        stringRedisTemplate.opsForHash().put("user:400","age","42");
    }

    @Test
    public void testHashGet(){
        Map<Object, Object> entries = stringRedisTemplate.opsForHash().entries("user:400");
        for (Object o : entries.keySet()) {
            System.out.println("key:"+o.toString()+" value:"+entries.get(o));
        }
    }

}
