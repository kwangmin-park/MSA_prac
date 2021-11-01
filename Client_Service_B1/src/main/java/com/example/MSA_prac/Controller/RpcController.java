package com.example.MSA_prac.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class RpcController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String SERVICE_B_NAME = "SERVICE-B";

    @GetMapping("/rpc/test")
    public String callServiceB(){
        ResponseEntity<String> ackMessage;
        String apiPath = "/api/healthCheck";

//        주목할 점은 실제 호스트네임과 포트명이 아닌 Eureka 서버에 등록된 service-b 어플리케이션의 인스턴스 네임을 사용하여 통신한다.
        ackMessage = restTemplate.getForEntity("http://" + SERVICE_B_NAME + apiPath, String.class);
        return "Service-A: inst001 호출" + " > " + ackMessage.getBody();
    }
}
