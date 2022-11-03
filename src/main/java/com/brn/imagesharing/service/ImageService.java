package com.brn.imagesharing.service;

import com.brn.imagesharing.entity.Image;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageService {
    public List<Image> getAll();
    public Image getImageById(int id);
    public void postImage(Image image);
}
