package com.summercollab.survey.api.models;

import java.util.Date;

/**
 * Created by sreeram.srini on 8/26/17.
 */
public class Survey {
    private Integer surveyId;
    private String surveyName;
    private Boolean active;
    private Date createdDate;
    private Date expiredDate;

    public Survey(Integer surveyId, String surveyName, Boolean active, Date createdDate, Date expiredDate) {
        this.surveyId = surveyId;
        this.surveyName = surveyName;
        this.active = active;
        this.createdDate = createdDate;
        this.expiredDate = expiredDate;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "surveyId=" + surveyId +
                ", surveyName='" + surveyName + '\'' +
                ", active=" + active +
                ", createdDate=" + createdDate +
                ", expiredDate=" + expiredDate +
                '}';
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }
}
