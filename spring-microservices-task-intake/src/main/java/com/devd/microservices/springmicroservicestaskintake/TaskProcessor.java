package com.devd.microservices.springmicroservicestaskintake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.cloud.task.launcher.TaskLaunchRequest;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Devaraj Reddy on 2/17/2018.
 */
@Component
@EnableBinding(Source.class)
public class TaskProcessor {

    @Autowired
    Source source;

    public void publishRequest(String payload) {

        //maven://[groupid]:[artifactid]:jar:[version]
        String url = "maven://com.devd.microservices:spring.microservices.task:jar:0.0.1-SNAPSHOT";

        List<String> input = new ArrayList<>(Arrays.asList(payload.split(",")));

        TaskLaunchRequest taskLaunchRequest = new TaskLaunchRequest(url, input, null, null,"appName");

        System.out.println("Created task request");

        GenericMessage<TaskLaunchRequest> genericMessage = new GenericMessage<TaskLaunchRequest>(taskLaunchRequest);
        this.source.output().send(genericMessage);

    }
}