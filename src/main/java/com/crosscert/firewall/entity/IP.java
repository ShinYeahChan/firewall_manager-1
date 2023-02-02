package com.crosscert.firewall.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class IP extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private IpAddress address;

    @Column
    private String domain;

    @Column
    private String description;

    @OneToOne(mappedBy = "devIp")
    private Member devMember;

    @OneToOne(mappedBy = "netIp")
    private Member netMember;
}