package com.joyful;

import com.joyful.util.JedisConnectionFactory;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest{
    private Jedis jedis;


    @Before
    public void setup() {
        jedis= JedisConnectionFactory.getJedis();
    }

    @Test
    public void testString(){
        String result = jedis.set("name", "张三");
        System.out.println(result);
        String name = jedis.get("name");
        System.out.println("name="+name);
    }
    @Test
    public void testSet(){
        jedis.hset("user:1","name", "joyful");
        Map<String, String> map = jedis.hgetAll("user:1");
        System.out.println(map);
    }
    @After
    public void tearDown() {
        if (jedis != null)
            jedis.close();
    }
}
