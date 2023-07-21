package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJointPointConfig {

    /*
    with this class we are generalising the point-cut rather than mentioning it for every other call.
    its better practice.
    */
    @Pointcut( "execution(* com.in28minutes.spring.aop.springaop.Business.*.*(..))")
    public void businessLayerExecution(){

        //blah blah

    }

    @Pointcut( "execution(* com.in28minutes.spring.aop.springaop.data.*.*(..))")
    public void dataLayerExecution(){

        //blah blah

    }

    //combining two Point-cuts here
    @Pointcut("dataLayerExecution() && businessLayerExecution()")
    public void anyLayerExecution(){

        //blah blah

    }


    @Pointcut( "Bean(Dao*)") //intercept all beans with Dao in it...we can also put regex in Point-cut.
    public void beanStartingWithDao(){

        //blah blah

    }

    @Pointcut( "Within(com.in28minutes.spring.aop.springaop.data..*)") //intercept all beans within data layer in it
    public void dataLayerExecutionWithWithin(){

        //blah blah

    }



    //this customized point-cut will help to selectively time track methods - 77th video
    @Pointcut("@annotation(com.in28minutes.spring.aop.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation(){

        //blah blah

    }


}
