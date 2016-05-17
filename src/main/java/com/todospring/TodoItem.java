package com.todospring;

import javax.persistence.*;

@Entity
@Table(name = "todoitems")
public class TodoItem {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String text;

    @Column(nullable = false)
    Boolean isdone;

    @Column(nullable = false)
    int userid;

    public TodoItem() {
    }

    public TodoItem(String text, boolean isdone, int userid) {
        this.text = text;
        this.isdone = isdone;
        this.userid = userid;

    }
}
