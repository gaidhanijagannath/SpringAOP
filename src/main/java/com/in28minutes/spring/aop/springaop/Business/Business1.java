package com.in28minutes.spring.aop.springaop.Business;

import com.in28minutes.spring.aop.springaop.data.DAO1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private DAO1 dao1;

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    public String calculateSomething(){

        return dao1.retrieveSomething();

        /*String value = dao1.retrieveSomething();
        logger.info("In Business - {}", value);
        return value;*/
    }
}
