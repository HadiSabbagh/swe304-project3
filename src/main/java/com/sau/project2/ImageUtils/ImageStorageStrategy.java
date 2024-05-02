package com.sau.project2.ImageUtils;

import com.sau.project2.Entity.Person;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImageStorageStrategy {

    /**
     * @param file
     * Save the image (in case the app is running locally, it is a path to the image. For cloud, it is the image's name(key))
     * @return path or key
     * @throws IOException
     */
    String saveImage(MultipartFile file) throws IOException;


    String getImagePathFromUrl(String url); // Local takes path, Ec2 takes image name (key)

    void deleteImage(Person person) throws IOException;

    String getImageName(String img_url);

}
