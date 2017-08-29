package com.summercollab.survey.aspecting;

import com.summercollab.survey.services.LogRequestResponseService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sreeram.srini on 8/28/17.
 */
@Aspect
@Component
public class RequestResponseCaptureAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(RequestResponseCaptureAspect.class);
    @Autowired
    private LogRequestResponseService logRequestResponseService;

    @Around("execution(* com.summercollab.survey.api.SurveyController.getQuestions()) ")
    public Object beforegetQuestions(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {



        logRequestResponseService.logResponse("A request was issued for questions: ");
        try {
            Object responseObject = proceedingJoinPoint.proceed();
            logRequestResponseService.logResponse(responseObject);

            return responseObject;
        }
        catch (Exception ex) {
           logRequestResponseService.logResponse("No Information Found!!!");
            throw ex;
        }

    }


}
