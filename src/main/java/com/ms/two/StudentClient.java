package com.ms.two;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="spring-ms-one")
public interface StudentClient {

    @GetMapping("/student")
    public Student getStudent();

}
