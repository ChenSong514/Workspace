package com.joyful.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisConnectionFactory {
    private static final JedisPool jedisPool;
    static {
        JedisPoolConfig config=new JedisPoolConfig();
        config.setMaxTotal(8);
        config.setMaxIdle(8);
        config.setMinIdle(0);
        config.setMaxWaitMillis(200);
        jedisPool=new JedisPool(config,"43.142.102.29",6379,1000,"memo");
    }

    public static Jedis getJedis() {
        return jedisPool.getResource();
    }
}
