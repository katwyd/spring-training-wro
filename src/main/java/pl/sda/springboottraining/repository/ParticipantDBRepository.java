package pl.sda.springboottraining.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.springboottraining.repository.model.Participant;

import java.util.List;

public interface ParticipantDBRepository extends CrudRepository<Participant, Integer> {

    List<Participant> findAll();
}
