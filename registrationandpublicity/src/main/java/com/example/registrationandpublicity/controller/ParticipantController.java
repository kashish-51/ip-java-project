package com.example.registrationandpublicity.controller;

import com.example.registrationandpublicity.entity.Participant;
import com.example.registrationandpublicity.service.ParticipantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/participants")
public class ParticipantController {

    private final ParticipantService participantService;

    public ParticipantController(ParticipantService participantService) {
        this.participantService = participantService;
    }

    @GetMapping
    public List<Participant> findAllParticipants() {
        return participantService.findAllParticipants();
    }

    @GetMapping("/{id}")
    public Optional<Participant> findParticipantById(@PathVariable("id") Long id) {
        return participantService.findById(id);
    }

    @PostMapping
    public Participant saveParticipant(@RequestBody Participant participant) {
        return participantService.saveParticipant(participant);
    }

    @PutMapping("/{id}")
    public Participant updateParticipant(@PathVariable("id") Long id, @RequestBody Participant participant) {
        return participantService.updateParticipant(participant);
    }

    @DeleteMapping("/{id}")
    public void deleteParticipant(@PathVariable("id") Long id) {
        participantService.deleteParticipant(id);
    }
}
