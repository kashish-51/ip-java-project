package com.example.registrationandpublicity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.registrationandpublicity.entity.Participant;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {
    
}
