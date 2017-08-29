package com.summercollab.survey.api;

import com.summercollab.survey.api.models.Questions;
import com.summercollab.survey.services.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by sreeram.srini on 8/26/17.
 */
@RestController
public class SurveyController {



    @Autowired
    private SurveyService surveyService;
    @RequestMapping(method = RequestMethod.GET,value = "/api/v1/survey")
    public String getSurvey() {

        return surveyService.getSurvey();
    }

    @RequestMapping(method= RequestMethod.GET,value="/api/v1/questions")
    public List<Questions> getQuestions() {

        return surveyService.getQuestions();
    }
}
