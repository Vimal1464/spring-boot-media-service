package com.vimal1464.media.impl;
import com.vimal1464.media.entity.FileEntity;
import com.vimal1464.media.repo.FileRepo;
import com.vimal1464.media.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
@Service
public class FileServiceImp implements FileService {
    @Autowired
    private FileRepo fileRepo;
    @Override
    public String uploadImg( @RequestBody(required = true) MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        FileEntity fileEntity =  this.fileRepo.findByImageName(fileName);
        if (fileEntity!=null){
            return "File Already Exist";
        }
       FileEntity saveFile = new FileEntity();
        saveFile.setImageName(fileName);
        saveFile.setImage(file.getBytes());
        this.fileRepo.save(saveFile);
        return "File Uploaded Successfully";
    }
    @Override
    public byte[] getFile(String fileName) throws IOException {
        FileEntity fileEntity =  this.fileRepo.findByImageName(fileName);
        return fileEntity.getImage();
    }


}
