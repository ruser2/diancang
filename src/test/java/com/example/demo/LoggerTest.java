package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @Author: zhouyh
 * @Date: 2018-03-22 14:24
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
    private final Logger logger=LoggerFactory.getLogger(getClass());
    MongoTemplate mongoTemplate;

    @Test
    public void test(){

        logger.debug("debug");
        logger.info("info");
        logger.error("error");
        log.debug("debug");
        log.info("info");
        log.error("error");
    }
}
