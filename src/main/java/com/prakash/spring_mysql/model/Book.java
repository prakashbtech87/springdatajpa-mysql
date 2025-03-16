package com.prakash.spring_mysql.model;

import jakarta.persistence.*;
import lombok.*;

/**
 * Book - Entity class representing the 'book' table in the database.
 * This class is mapped to the 'book' table using JPA annotations.
 *
 * Lombok is used to generate boilerplate code such as getters, setters,
 * constructors, and toString method automatically.
 *
 * @author Prakash Karuppusamy
 */
@Entity // Marks this class as a JPA entity (database table representation)
@Table(name = "book") // Specifies the table name in the database
@Getter // Generates getter methods for all fields
@Setter // Generates setter methods for all fields
@NoArgsConstructor // Generates a no-argument constructor
@AllArgsConstructor // Generates a constructor with all arguments
@ToString // Generates a toString method for easy debugging and logging
public class Book {

    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID generation
    private Long id;

    @Column(nullable = false) // Ensures that title cannot be null in the database
    private String title;

    private String author; // Represents the book's author
    private double price; // Represents the book's price
}