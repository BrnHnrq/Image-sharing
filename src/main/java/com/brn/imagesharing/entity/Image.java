package com.brn.imagesharing.entity;

import lombok.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;

import javax.persistence.*;
import java.io.IOException;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "image_title")
    private String imageTitle;
    @Column(name = "image_desc")
    private String imageDesc;
    @Column(name = "image_filename")
    private String imageFileName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return id == image.id && Objects.equals(imageTitle, image.imageTitle) && Objects.equals(imageDesc, image.imageDesc) && Objects.equals(imageFileName, image.imageFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imageTitle, imageDesc, imageFileName);
    }
}
