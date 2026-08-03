package org.alphaspring.etherstore.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;

import java.time.LocalDate;

@Setter
@Getter
@Table(name = "profiles")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name= "bio")
    private String bio;
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column( name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(name ="loyalty_points")
    private Integer loyaltyPoints;



    @OneToOne
    @JoinColumn(name = "id")
    @MapsId
    @ToString.Exclude
    private User user;

}
