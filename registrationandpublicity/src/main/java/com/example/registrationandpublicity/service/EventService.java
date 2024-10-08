package com.example.registrationandpublicity.service;

import com.example.registrationandpublicity.entity.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {
    List<Event> findAllEvents();
    Optional<Event> findById(Long id);
    Event saveEvent(Event event);
    Event updateEvent(Event event);
    void deleteEvent(Long id);
}
