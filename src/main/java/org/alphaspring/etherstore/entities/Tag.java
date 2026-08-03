package org.alphaspring.etherstore.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString
@Table(name = "tags")
@Entity
@NoArgsConstructor
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="name")
    private String name;

    @ManyToMany(mappedBy = "tags")
    @ToString.Exclude
    private Set<User> users = new HashSet<>();

    public Tag(String name) {

        this.name = name;

    }
}
