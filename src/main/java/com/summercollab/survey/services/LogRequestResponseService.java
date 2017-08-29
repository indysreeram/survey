package com.summercollab.survey.services;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Created by sreeram.srini on 8/28/17.
 */
@Service
public class LogRequestResponseService {
    private static Logger logger = Logger.getLogger(LogRequestResponseService.class);

       public void logResponse(Object object) {
           logger.info(object);
       }
}
