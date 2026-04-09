package com.example.mangerapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity representing a user in the system.
 */
@Entity
@Table(name = "users")
public final class User {

    /** Unique identifier for the user. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Name of the user. */
    @Column(nullable = false)
    private String name;

    /** Email of the user. */
    @Column(nullable = false, unique = true)
    private String email;

    /**
     * Default constructor.
     */
    public User() {
    }

    /**
     * Constructor with name and email.
     * @param userName the name of the user
     * @param userEmail the email of the user
     */
    public User(final String userName, final String userEmail) {
        this.name = userName;
        this.email = userEmail;
    }

    /**
     * Gets the user ID.
     * @return the user ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the user ID.
     * @param userId the user ID to set
     */
    public void setId(final Long userId) {
        this.id = userId;
    }

    /**
     * Gets the user name.
     * @return the user name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the user name.
     * @param userName the name to set
     */
    public void setName(final String userName) {
        this.name = userName;
    }

    /**
     * Gets the user email.
     * @return the user email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the user email.
     * @param userEmail the email to set
     */
    public void setEmail(final String userEmail) {
        this.email = userEmail;
    }
}