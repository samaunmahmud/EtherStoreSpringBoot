package org.alphaspring.etherstore.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Long maps to BIGINT

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, precision = 10, scale = 2, name = "price")
    private BigDecimal price; // BigDecimal is best practice for monetary/DECIMAL fields

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
}