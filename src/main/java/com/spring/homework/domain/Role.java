package com.spring.homework.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "role_table")
@ToString(exclude = "users")
public class Role {

    @Id
    @Column(name = "role_id")
    private Long id;

    @Column(name = "role_name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "role")
    private List<User> users;
}
