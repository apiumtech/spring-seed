package com.apiumtech.controller.forms;

/**
 * Created by roman on 18/01/16.
 */
public class PingForm {
    private String name;
    private Long created;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }
}
