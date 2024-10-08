package com.example.registrationandpublicity.controller;

import com.example.registrationandpublicity.entity.Event;
import com.example.registrationandpublicity.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> findAllEvents() {
        return eventService.findAllEvents();
    }

    @GetMapping("/{id}")
    public Optional<Event> findEventById(@PathVariable("id") Long id) {
        return eventService.findById(id);
    }

    @PostMapping
    public Event saveEvent(@RequestBody Event event) {
        return eventService.saveEvent(event);
    }

    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable("id") Long id, @RequestBody Event event) {
        return eventService.updateEvent(event);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable("id") Long id) {
        eventService.deleteEvent(id);
    }
}
