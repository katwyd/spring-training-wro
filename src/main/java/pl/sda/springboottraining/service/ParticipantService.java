package pl.sda.springboottraining.service;

import pl.sda.springboottraining.repository.model.Participant;

import java.util.List;
import java.util.Optional;

public interface ParticipantService {
    
    List<Participant> findAll();
    
    Optional<Participant> getByID(Integer id);
    
    Integer save(Participant participant);
    
    void update(Participant participant);
    
    void deleteByID(Integer id);
}
