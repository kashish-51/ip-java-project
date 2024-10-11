package com.example.registrationandpublicity.service.impl;

import com.example.registrationandpublicity.entity.Participant;
import com.example.registrationandpublicity.repository.ParticipantRepository;
import com.example.registrationandpublicity.service.ParticipantService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipantServiceImpl implements ParticipantService {

    private final ParticipantRepository participantRepository;

    public ParticipantServiceImpl(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }

    @Override
    public List<Participant> findAllParticipants() {
        return participantRepository.findAll();  // Return list of all participants
    }

    @Override
    public Optional<Participant> findById(Long id) {  // Return Optional<Participant>
        return participantRepository.findById(id);
    }

    @Override
    public Participant saveParticipant(Participant participantEntity) {
        return participantRepository.save(participantEntity);  // Save participant
    }

    @Override
    public Participant updateParticipant(Participant participantEntity) {
        return participantRepository.save(participantEntity);  // Update participant
    }

    @Override
    public void deleteParticipant(Long id) {
        participantRepository.deleteById(id);  // Delete participant by ID
    }
}
