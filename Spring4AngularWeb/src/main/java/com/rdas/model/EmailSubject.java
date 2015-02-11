package com.rdas.model;

import javax.persistence.*;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by rdas on 10/02/2015.
 */
@Entity
@Table(name = "email_subject")
public class EmailSubject {

    @Id
    @Column(name = "id", nullable = false)
    private String id;
    @Column(name = "value", nullable = false)
    private String value;

    public EmailSubject(String id, String value) {
        this.id=id;
        this.value=value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
