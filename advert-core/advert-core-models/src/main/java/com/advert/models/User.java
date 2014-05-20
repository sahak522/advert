package com.advert.models;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by sahak_000 on 21.05.2014.
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq")
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "name_arm")
    private String nameArm;

    @Column(name = "name_short")
    private String nameShort;

    @Column(name = "name_arm_short")
    private String nameArmShort;

    @Column(name = "requires_subtraction", nullable = false)
    private boolean requiredSubtractionOnImport;

    @Column(name = "represents_thousands", nullable = false)
    private boolean representsThousands;

    @Column(name = "sort_order", nullable = false)
    private int sortOrder;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @Column(name = "created", nullable = false, updatable = false)
    private DateTime created;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @Column(name = "deleted")
    private DateTime deleted;

    public User () {

    }
}
