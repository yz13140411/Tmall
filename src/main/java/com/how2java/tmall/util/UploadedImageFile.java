package com.how2java.tmall.util;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
@Data
public class UploadedImageFile {

    MultipartFile image;
}
