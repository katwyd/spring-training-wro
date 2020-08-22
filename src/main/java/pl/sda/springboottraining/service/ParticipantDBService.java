package pl.sda.springboottraining.service;

import org.springframework.stereotype.Service;
import pl.sda.springboottraining.repository.ParticipantDBRepository;
import pl.sda.springboottraining.repository.model.Participant;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipantDBService implements ParticipantService {
    
    private final ParticipantDBRepository participantDBRepository;

    public ParticipantDBService(ParticipantDBRepository participantDBRepository) {
        this.participantDBRepository = participantDBRepository;
    }

    @Override
    public List<Participant> findAll() {
        return participantDBRepository.findAll();
    }

    @Override
    public Optional<Participant> getByID(Integer id) {
        return participantDBRepository.findById(id);
    }

    @Override
    public Integer save(Participant participant) {
        return participantDBRepository.save(participant).getId();
    }

    @Override
    public void update(Participant participant) {
        participantDBRepository.save(participant);
    }

    @Override
    public void deleteByID(Integer id) {
        participantDBRepository.deleteById(id);
    }
}
