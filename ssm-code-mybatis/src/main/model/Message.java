package model;

import lombok.Data;


@Data
public class Message {
    private Integer id;

    private String command;

    private String description;

    private String content;

}