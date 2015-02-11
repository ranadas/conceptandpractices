package com.rdas.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdas.model.EmailSubject;

/**
 * Created by rdas on 10/02/2015.
 */
public interface EmailSubjectRepository extends JpaRepository<EmailSubject, Long> {
}
