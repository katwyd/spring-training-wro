package pl.sda.springboottraining.repository.model;

import lombok.*;

import javax.persistence.*;

@Setter
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "id_number", nullable = false, length = 10)
    private String idNumber;
}
