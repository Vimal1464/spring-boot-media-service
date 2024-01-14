package com.vimal1464.media.service;


import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public interface FileService {
    String uploadImg( MultipartFile file) throws IOException;
    byte[] getFile(String fileName) throws IOException;
}
