package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP indication
@Aspect
@Configuration
public class AfterAOPRequest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @AfterReturning( value = "com.in28minutes.spring.aop.springaop.aspect.CommonJointPointConfig.businessLayerExecution()",
            returning = "result")
    public void after(JoinPoint joinPoint, Object result){

        logger.info("Executed the {} returned with value - {}", joinPoint , result);
    }

    //@AfterThrowing -  intercept after an occurrence of an exception.

    /*
    @AfterReturning( value = "execution(* com.in28minutes.spring.aop.springaop.Business.*.*(..))",
            returning = "exception")
    public void after(JoinPoint joinPoint, Object exception){ // to get to know which methods was intercepted ?

        logger.info("{} returned with value - {}", joinPoint, exception);
    }*/



   /* @After(value = "com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void after(JoinPoint joinPoint) {
        logger.info("after execution of {}", joinPoint);
    }*/



}
