package com.demo.mms.common.domain;

public class Admin extends User{

    private String avator_url;

    private String note;

    private String create_time;

    private String update_time;

    public String getAvator_url() {
        return avator_url;
    }

    public void setAvator_url(String avator_url) {
        this.avator_url = avator_url;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String getCreate_time() {
        return create_time;
    }

    @Override
    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    @Override
    public String getUpdate_time() {
        return update_time;
    }

    @Override
    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }
}