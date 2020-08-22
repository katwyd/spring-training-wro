package pl.sda.springboottraining;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.sda.springboottraining.repository.ParticipantDBRepository;
import pl.sda.springboottraining.repository.model.Participant;

@Component
public class Runner implements CommandLineRunner {

    private final ParticipantDBRepository participantDBRepository;

    public Runner(ParticipantDBRepository participantDBRepository) {
        this.participantDBRepository = participantDBRepository;
    }

    @Override
    public void run(String... args) {
        Participant participant = new Participant();
        participant.setIdNumber("1234567890");
        participant.setFirstName("Jan");
        participant.setLastName("Kowalski");

        participantDBRepository.save(participant);
    }
}
