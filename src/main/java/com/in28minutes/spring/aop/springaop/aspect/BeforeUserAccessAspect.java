package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP indication
@Aspect
@Configuration
public class BeforeUserAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /* This methodology we use when we require some access from user like location, contact fetch etc.
     */

    /*
     format to intercept something inside package is below

     => execution(* PACKAGE.*.*(..))

     1(*) - means any return type.
     2(.*) - means intercept all class in that PACKAGE
     3.*(..) - means intercept all method calls irrespective of the arguments.

    - AOP terminologies
	    POINT-CUT - what kind of methods to intercept.
	    ADVICE - means what to do after interception.
        ASPECT - is combination of point-cut and advice.
	    JOINT-POINT - specific interception of method call, it's an execution instance
		    - e.g for 100 methods 100 join points.
	    process of implementing all above together is called WEAVING and frmk who does that is WEAVER.


     */

    //before contains which methods to intercept.
    //Point-cut
    @Before("com.in28minutes.spring.aop.springaop.aspect.CommonJointPointConfig.dataLayerExecution()")
    public void before(JoinPoint joinPoint){ // to get to know which method is getting intercepted ?


        //Advice - the below instruction after interception.
        logger.info("Check for USER ACCESS");
        logger.info("Intercepted method call : Allowed access to USER => {}", joinPoint);

    }
}
