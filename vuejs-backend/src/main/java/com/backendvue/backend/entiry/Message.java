package com.backendvue.backend.entiry;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * Message
 * Date: 4/10/2019
 * Time: 2:20 PM
 */

@Document
public class Message {
    @Id
    private String id;
    private String description;
    private Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
