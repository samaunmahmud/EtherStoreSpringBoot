package org.alphaspring.etherstore.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
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


}
