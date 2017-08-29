package com.summercollab.survey.api.models;

/**
 * Created by sreeram.srini on 8/26/17.
 */
public class Category {

    private Integer categoryId;
    private String categoryTxt;
    private Integer sortOrder;

    public Category(Integer categoryId, String categoryTxt, Integer sortOrder) {
        this.categoryId = categoryId;
        this.categoryTxt = categoryTxt;
        this.sortOrder = sortOrder;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryTxt='" + categoryTxt + '\'' +
                ", sortOrder=" + sortOrder +
                '}';
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryTxt() {
        return categoryTxt;
    }

    public void setCategoryTxt(String categoryTxt) {
        this.categoryTxt = categoryTxt;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}
