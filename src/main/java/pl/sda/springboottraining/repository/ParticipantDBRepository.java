package pl.sda.springboottraining.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.springboottraining.repository.model.Participant;

import java.util.List;

@Repository
public interface ParticipantDBRepository extends CrudRepository<Participant, Integer> {

    List<Participant> findAll();
}
