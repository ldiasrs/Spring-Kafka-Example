package com.ldiasrs.samples.Kafka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {


    private Sender sender;

    public SenderController(Sender sender) {
        this.sender = sender;
    }

    @GetMapping("/msg/{name}")
    public void publish(@PathVariable String name) {
        String msg = "Hello, " + name + "!";
        sender.send(msg);
    }
}
