package com.tony.ringtonemall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RingtonemallApplication {

    public static void main(String[] args) {
        SpringApplication.run(RingtonemallApplication.class, args);
    }

    @RestController
    public static class HelloController {

        @GetMapping("/hello/{msg}")
        public String hello(@PathVariable("msg") String msg) {
            return msg;
        }
    }


}
