package com.example.restagram.domain;

import com.example.restagram.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Users {

    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String userName;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "users")
    private List<Posts> posts;
}
