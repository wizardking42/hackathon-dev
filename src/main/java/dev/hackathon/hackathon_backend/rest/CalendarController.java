package dev.hackathon.hackathon_backend.rest;

import dev.hackathon.hackathon_backend.domain.calendar.Calendar;
import dev.hackathon.hackathon_backend.domain.calendar.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class CalendarController {
    private final CalendarService calendarService;

    @Autowired
    public CalendarController(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

    @GetMapping("/calendar")
    public List<Calendar> getAllEvents() {
        return calendarService.findAll();
    }
}
