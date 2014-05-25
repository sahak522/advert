package com.advert.models;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by user on 25.05.2014.
 */
@Entity
@Table(name = "role")
public class Role implements Serializable {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Permission.class)
    @JoinTable(name = "role_permission",
            joinColumns = {
                    @JoinColumn(name = "role_id", nullable = false, updatable = false)
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "permission_id", nullable = false, updatable = false)
            },
            uniqueConstraints = {@UniqueConstraint(columnNames = {"role_id", "permission_id"})})
    private Set<Permission> permissions;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @Column(name = "created", nullable = false, updatable = false)
    private DateTime created;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @Column(name = "updated", nullable = false)
    private DateTime updated;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @Column(name = "deleted")
    private DateTime deleted;

    public Role () {

    }
}
