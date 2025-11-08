//package com.aplish.camunda.components;
//
//
//import io.camunda.zeebe.client.ZeebeClient;
//import io.camunda.zeebe.client.api.response.ProcessInstanceEvent;
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class FirstComponent {
//
//
//    @Autowired
//    ZeebeClient zeebeClient;
//
//
//
//
//
//   @PostConstruct
//    public void init() {
//       final ProcessInstanceEvent processInstanceEvent =
//               zeebeClient
//                       .newCreateInstanceCommand()
//                       .bpmnProcessId("MY_FIRST_WF")
//                       .latestVersion()
//                       .send()
//                       .join();
//    }
//}
