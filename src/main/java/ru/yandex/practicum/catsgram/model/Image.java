package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

//модель, которая описывает изображения, прикреплённые к конкретному сообщению
@Data
@EqualsAndHashCode(of = "id")
public class Image {
    private Long id;
    private long postId;
    private String originalFileName;
    private String filePath;
}
