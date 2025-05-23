package ai.chatbot.sample.web;

import ai.chatbot.sample.dto.Greeting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@Slf4j
public class HelloResource {

    private static final String template = "Hello, %s!";
    private static final AtomicLong COUNTER = new AtomicLong();

    @GetMapping("/hello")
    public Greeting hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        log.info("Received request with name: {}", name);
        return new Greeting(COUNTER.incrementAndGet(), String.format(template, name));
    }

}