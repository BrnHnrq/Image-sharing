package com.brn.imagesharing.repository;

import com.brn.imagesharing.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {
}
