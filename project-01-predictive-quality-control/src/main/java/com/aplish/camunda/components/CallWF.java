package com.aplish.camunda.components;


import io.camunda.zeebe.client.ZeebeClient;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CallWF {


    @Autowired
    ZeebeClient zeebeClient;



  //  @PostConstruct
    public void callWf(){
        zeebeClient.newPublishMessageCommand()
                .messageName("XEventReceived")
                .correlationKey("12345")
                .send()
                .join();
    }

}
