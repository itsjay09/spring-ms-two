package com.ms.two;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

@RestController
public class MSTwoController {

    StudentClient studentFeignClient;

    public MSTwoController(StudentClient studentFeignClient) {
        this.studentFeignClient = studentFeignClient;
    }

    @GetMapping("/get-student")
    public Student getMessage() {
        Student student = studentFeignClient.getStudent();
        return student;
    }


    private static HttpEntity<?> getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        return new HttpEntity<>(headers);
    }
}
