package com.vimal1464.media.repo;

import com.vimal1464.media.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepo extends JpaRepository<FileEntity,Long> {
     FileEntity findByImageName(String imageName);
}
