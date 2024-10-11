package com.example.registrationandpublicity.service;

import com.example.registrationandpublicity.entity.Participant;

import java.util.List;
import java.util.Optional;

public interface ParticipantService {
    List<Participant> findAllParticipants();
    Optional<Participant> findById(Long id);  // Return type as Optional<Participant>
    Participant saveParticipant(Participant participantEntity);
    Participant updateParticipant(Participant participantEntity);
    void deleteParticipant(Long id);
}
