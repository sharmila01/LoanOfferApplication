package com.dto.request;

public class CategoryInfoReq {
    private int categoryId;

    public CategoryInfoReq() {
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }


    @Override
    public String toString() {
        return "CategoryInfoReq{" +
                "categoryId=" + categoryId +
                '}';
    }
}
