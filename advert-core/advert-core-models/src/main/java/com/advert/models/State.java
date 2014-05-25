package com.advert.models;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by user on 25.05.2014.
 */
@Entity
@Table(name = "state")
public class State implements Serializable {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Country.class)
    private Country country;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @Column(name = "created", nullable = false, updatable = false)
    private DateTime created;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @Column(name = "updated", nullable = false)
    private DateTime updated;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @Column(name = "deleted")
    private DateTime deleted;

    public State () {

    }
}
