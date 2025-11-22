package com.aplish.camunda.components;


import io.camunda.zeebe.client.ZeebeClient;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CallWF {


    @Autowired
    ZeebeClient zeebeClient;



    @PostConstruct
    public void callWf(){
        zeebeClient.newBroadcastSignalCommand()
                .signalName("MY_FIRST_SIGNAL")
                .send()
                .join();
    }

}
