package com.summercollab.survey;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SurveyApplication {

  private static Logger logger = Logger.getLogger(SurveyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SurveyApplication.class, args);
		logger.info("Logger Enabled for Main");

	}
}
