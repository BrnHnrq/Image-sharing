package com.brn.imagesharing.service;

import com.brn.imagesharing.entity.Image;
import com.brn.imagesharing.exception.ImageNotFoundException;
import com.brn.imagesharing.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageServiceImpl implements ImageService{

    @Autowired
    ImageRepository imageRepository;

    @Override
    public List<Image> getAll() {
        return imageRepository.findAll();
    }

    @Override
    public Image getImageById(int id) {
        Optional<Image> result = imageRepository.findById(id);

        if(result.isEmpty()){
            throw new ImageNotFoundException("Could not find image by id - " + id);
        }

        return result.get();
    }

    @Override
    public void postImage(Image image) {
        imageRepository.save(image);
    }
}
