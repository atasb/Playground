/*******************************************************************************
 * Copyright (c) 2017 This is my Application, dont us it without my permission
 * Creator and Projekt-Lead Barico
 *
 * Contributors: PRODYNA AG - All rights reserved
 *******************************************************************************/
package org.jboss.own.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public abstract class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Size(min = 3, message = "Name muss mindestens 3 Zeichen haben")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Name darf nur aus Buchstaben bestehen")
    protected String name;

    @Pattern(regexp = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$",
            message = "Das ist keine gültige Email-Adresse")
    protected String email;

    protected String mode;

    public String getMode() {
        return mode;
    }

    public void setMode(final String mode) {
        this.mode = mode;
    }

    public AppUser() {

    }

    public AppUser(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

}
