package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "facility")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //to autoincrement
    private long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @ManyToOne()
    @JoinColumn(name = "room_id")
    private Room room;
}
