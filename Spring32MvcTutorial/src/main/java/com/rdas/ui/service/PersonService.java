package com.rdas.ui.service;

import com.rdas.ui.model.Person;
import org.springframework.stereotype.Component;

/**
 * Created by rdas on 27/01/2015.
 */
@Component
public class PersonService {
    public Person getPersonDetail(Integer id){
        Person p = new Person();
        p.setId(id);
        p.setLocation("Dublin");
        p.setName("Rana Das");
        return p;
    }
}
