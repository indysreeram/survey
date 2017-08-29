package com.summercollab.survey.api.models;

import java.util.Date;

/**
 * Created by sreeram.srini on 8/26/17.
 */
public class Questions {

    private Integer questionId;
    private Integer categoryId;
    private String questionTxt;
    private Date createdDate;
    private Date expiredDate;

    public Questions(Integer questionId, Integer categoryId, String questionTxt, Date createdDate, Date expiredDate) {
        this.questionId = questionId;
        this.categoryId = categoryId;
        this.questionTxt = questionTxt;
        this.createdDate = createdDate;
        this.expiredDate = expiredDate;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "questionId=" + questionId +
                ", categoryId=" + categoryId +
                ", questionTxt='" + questionTxt + '\'' +
                ", createdDate=" + createdDate +
                ", expiredDate=" + expiredDate +
                '}';
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getQuestionTxt() {
        return questionTxt;
    }

    public void setQuestionTxt(String questionTxt) {
        this.questionTxt = questionTxt;
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
