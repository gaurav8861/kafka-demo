package com.kafka.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaProducerController {

    @Autowired
    private KafKaProducerService producerService;


    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message, @RequestParam("limit") String limit)
    {
        for (int i=0 ; i<Integer.parseInt(limit) ; i++ ){
            this.producerService.sendMessage(message + " -> " + i);
        }

    }
}
