package com.in28minutes.spring.aop.springaop.Business;

import com.in28minutes.spring.aop.springaop.data.DAO2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private DAO2 dao2;

    public String calculateSomething(){

        return dao2.retrieveSomething();


    }
}
