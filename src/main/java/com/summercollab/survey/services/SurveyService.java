package com.summercollab.survey.services;

import com.summercollab.survey.api.models.Questions;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sreeram.srini on 8/26/17.
 */
@Service
public class SurveyService {

  private static Logger logger = Logger.getLogger(SurveyService.class);


    public String getSurvey(){
        return "Stay Tuned we are working on it !!!";
    }

    public List<Questions> getQuestions()  {

        List<Questions> questionsList = new ArrayList<>();

        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        Date createdDate = null;
        try {
            createdDate = df.parse("01-01-2017");
        } catch (ParseException e) {
            e.printStackTrace();
        }


        questionsList.add(new Questions(1, 1, "How well does the staff understand the system ?", createdDate, null));
        questionsList.add(new Questions(2, 1, "What is the level of feedback Staff receives from camp leadership on system compliance ?", createdDate, null));
        questionsList.add(new Questions(3, 1, "How much are Campers invested in or display an understanding of the System ?", createdDate, null));
        questionsList.add(new Questions(4, 2, "Do Campers appropriate and respectful behavior to each other and staff ?", createdDate, null));
        questionsList.add(new Questions(5, 2, "Do Campers assume responsibility for Classroom routine and procedures ?", createdDate, null));
        questionsList.add(new Questions(6, 2, "How engagers are Campers in camp activities?", createdDate, null));
        questionsList.add(new Questions(7, 3, "How well does staff adhere to Behavioral Management System?", createdDate, null));

//        logger.info(questionsList);
        return questionsList;

    }
}
