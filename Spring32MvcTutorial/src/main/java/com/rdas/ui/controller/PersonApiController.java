package com.rdas.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rdas.ui.model.Person;
import com.rdas.ui.service.PersonService;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rdas on 27/01/2015.
 */
@Controller
@RequestMapping("/person")
public class PersonApiController {

    @Autowired
    private PersonService personService;

    /**
     * http://localhost:8080/person/getperson?id=99
     */
    @RequestMapping("/getperson")
    public @ResponseBody Person getPersonDetail(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
        Person p = personService.getPersonDetail(id);
        return p;
    }
}
