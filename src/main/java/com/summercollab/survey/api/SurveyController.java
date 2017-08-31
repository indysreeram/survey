package com.summercollab.survey.api;


import com.summercollab.survey.services.Repositories.Entities.Questions;
import com.summercollab.survey.services.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

        return surveyService.getAllQuestions();
    }

    @RequestMapping(method=RequestMethod.GET,value="/api/v1/questions/{questionId}")
    public Questions getQuestions(@PathVariable  Integer questionId){

        return surveyService.getQuestions(questionId);

    }

    @RequestMapping(method=RequestMethod.POST,value="/api/v1/questions")
    public void addQuestion(@RequestBody Questions questions ){
        surveyService.saveQuestions(questions);

    }
}
