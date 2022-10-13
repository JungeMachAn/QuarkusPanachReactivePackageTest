package de.teckpro.test.person;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import io.smallrye.mutiny.Uni;

import javax.persistence.Entity;

@Entity
public class Person extends PanacheEntity {
    public String name;

    public static Uni<Person> findByName(String name){
        return find("name", name).firstResult();
    }

}
