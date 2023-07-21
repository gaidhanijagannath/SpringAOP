package com.in28minutes.spring.aop.springaop.data;

import com.in28minutes.spring.aop.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DAO2 {
    @TrackTime
    public String retrieveSomething(){

        return "DAO2";

    }
}
