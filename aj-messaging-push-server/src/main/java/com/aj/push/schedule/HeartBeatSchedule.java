package com.aj.push.schedule;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * 节点心跳
 */
@Component
@Configuration
@EnableScheduling
@EnableAsync
public class HeartBeatSchedule {



}
