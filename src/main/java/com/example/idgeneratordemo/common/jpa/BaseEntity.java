package com.example.idgeneratordemo.common.jpa;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", type = CustomIdGenerator.class)
    protected String id;

    public String id() {
        return id;
    }
}
