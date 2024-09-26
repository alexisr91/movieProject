package com.example.MovieProject.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public String uploadFile(String path, MultipartFile file) throws IOException {
       
        
       return null;
    }

    @Override
    public InputStream getResourceFile(String path, String name) throws FileNotFoundException {
        return null;
    }
}
