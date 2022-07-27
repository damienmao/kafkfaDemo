package com.example.demo.Controller;

import com.example.demo.Service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/kafka")
public class kafkaController {
    private KafkaProducerService kafkaProducerService;

    @Autowired
    public kafkaController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }
@PostMapping(value = "/publish")
    public void sendMessage(@RequestParam(name = "message") String msg) {
        this.kafkaProducerService.sendMessage(msg);
    }
}
