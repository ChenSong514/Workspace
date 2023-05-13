package com.joyful;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 */
public class Main {
    private static Jedis jedis;
    public static void main(String[] args) {
        jedis=new Jedis("43.142.102.29",6379);
        jedis.auth("memo");
        jedis.select(0);
        System.out.println("Hello World!");
    }
}
