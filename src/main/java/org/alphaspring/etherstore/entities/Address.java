package org.alphaspring.etherstore.entities;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name ="street")
    private String street;
    @Column(name ="city")
    private String city;
    @Column( name="zip")
    private String zip;
    @Column( name = "state")
    private String state;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    private User user;


}
