package com.brn.imagesharing.controller;

import com.brn.imagesharing.entity.Image;
import com.brn.imagesharing.service.ImageService;

import org.apache.catalina.User;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.ServletContextResource;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
public class ImageController {

    @Autowired
    ImageService imageService;


    @GetMapping("/image")
    public List<Image> getAll(){
        return imageService.getAll();
    }

    /*
    @GetMapping("/image/{id}")
    public ResponseEntity<byte[]> getImage(@PathVariable int id) throws IOException {
        Image image = imageService.getImageById(id);
        var imgFile = new ClassPathResource("images/" + image.getImageFileName());
        byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());

        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(bytes);
    }
    */

    @GetMapping("/image/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Image getImage(@PathVariable int id){
        return imageService.getImageById(id);
    }

    @PostMapping("/image")
    @ResponseStatus(HttpStatus.CREATED)
    public Image postImage(@RequestBody Image image) {
        imageService.postImage(image);
        return image;
    }

    @PutMapping("/image")
    @ResponseStatus(HttpStatus.CREATED)
    public Image putImage(@RequestBody Image image) {
        imageService.postImage(image);
        return image;
    }
}
