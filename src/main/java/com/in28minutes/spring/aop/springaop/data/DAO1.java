package com.in28minutes.spring.aop.springaop.data;

import com.in28minutes.spring.aop.springaop.aspect.MethodExecutionCalculationAspect;
import com.in28minutes.spring.aop.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DAO1 {

    /* as we have selectively mentioned this method so only this method will get called by
     MethodExecutionCalculationAspect class.
     */

    // we can put @TrackTime on any method and track its time

    @TrackTime //for this custom annotation we will need a class TrackTime
    public String retrieveSomething(){

        return "DAO1";



    }
}
