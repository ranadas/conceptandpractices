//package com.rdas.db;
//
//import com.rdas.model.EmailSubject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.annotation.PostConstruct;
//
///**
// * Created by rdas on 10/02/2015.
// */
//@Service
//@Repository
//public class EmailServiceService {
//
//    @Autowired
//    private EmailSubjectRepository emailSubjectRepository;
//
//    @PostConstruct
//    @Transactional
//    public void populate() {
//        emailSubjectRepository.saveAndFlush(new EmailSubject("bug", "Report a Bug"));
//        emailSubjectRepository.saveAndFlush(new EmailSubject("account", "Account Problems"));
//        emailSubjectRepository.saveAndFlush(new EmailSubject("mobile", "Mobile"));
//        emailSubjectRepository.saveAndFlush(new EmailSubject("user", "Report a Malicious User"));
//        emailSubjectRepository.saveAndFlush(new EmailSubject("other", "Other"));
//        emailSubjectRepository.saveAndFlush(new EmailSubject("fwd", "Forward"));
//        emailSubjectRepository.saveAndFlush(new EmailSubject("fwd-all", "Forward All"));
//
//    }
//}