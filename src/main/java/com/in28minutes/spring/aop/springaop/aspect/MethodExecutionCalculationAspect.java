package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP indication
@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //we are playing around invocation.
    //before interception -> do something when intercept -> after interception.

    @Around( value = "com.in28minutes.spring.aop.springaop.aspect.CommonJointPointConfig.trackTimeAnnotation()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        //start time = x
        long startTime = System.currentTimeMillis();

        //allow method to execute.
         Object retVal = joinPoint.proceed(); //throws.

        //end time.
        long timeTaken =  System.currentTimeMillis() - startTime;

        logger.info("Time taken by {} is {}",joinPoint, timeTaken);

        return retVal;

    }



}
