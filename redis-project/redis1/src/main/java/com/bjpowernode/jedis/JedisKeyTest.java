package com.bjpowernode.jedis;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class JedisKeyTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.31.128",6379);
        String ret = jedis.ping();
        System.out.println(ret);
        Set<String> keys = jedis.keys("*");
        for(String key:keys){
            //aa
            System.out.println(key);
        }
    }
}
