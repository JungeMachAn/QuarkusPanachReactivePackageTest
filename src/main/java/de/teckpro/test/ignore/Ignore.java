package de.teckpro.test.ignore;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import io.smallrye.mutiny.Uni;

import javax.persistence.Entity;

@Entity
public class Ignore extends PanacheEntity {
    public String name;

    public static Uni<Ignore> findByName(String name){
        return find("name", name).firstResult();
    }

}
