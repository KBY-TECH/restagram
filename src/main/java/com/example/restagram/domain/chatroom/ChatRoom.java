package com.example.restagram.domain.chatroom;


import com.example.restagram.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@ToString
@Entity
public class ChatRoom extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String roomId;
    private String name;


    @Builder
    public ChatRoom( String roomId,String name) {
        this.name = name; // 유저 아이디로 대체..
        this.roomId=roomId;
    }


}
