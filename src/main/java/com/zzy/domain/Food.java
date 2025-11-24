package com.zzy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    private Integer id;
    private String title;
    private String subTitle;
    private Double rating;
    private Integer ratingsCount;
    private String image;
    private LocalDateTime crateAt;
    private LocalDateTime updateAt;
}
