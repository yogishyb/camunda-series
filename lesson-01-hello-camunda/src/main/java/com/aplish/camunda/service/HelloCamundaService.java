package com.aplish.camunda.service;


import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloCamundaService {

    @Autowired
    ZeebeClient zeebeClient;


    @JobWorker(type = "hello-camunda")
    public void handleFirstJob(final ActivatedJob job) {
        System.out.println("Hello from hello-camunda worker");
    }
}
