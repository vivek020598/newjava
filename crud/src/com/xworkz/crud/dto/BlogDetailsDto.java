package com.xworkz.crud.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BlogDetailsDto {
    private String title;
    private String author;
    private String content;
    private String category;
    private String tags;
    private String area;
    private String country;
    private int likes;
    private int views;
}
