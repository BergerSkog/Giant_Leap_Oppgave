package main.java.com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import static java.lang.Integer.parseInt;

@RestController
public class Parkeringscontroller {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/takst")
    public Parkering parkering(@RequestParam(value = "sone", defaultValue = "World") String sone, @RequestParam(value = "uke", defaultValue = "true") String Uke,
                               @RequestParam(value = "min", defaultValue = "0") String min, @RequestParam(value = "klokke", defaultValue = "0") String klokke){
        return new Parkering(counter.incrementAndGet(), sone, Uke, parseInt(min), parseInt(klokke));
    }
}
