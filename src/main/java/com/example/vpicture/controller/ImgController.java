package com.example.vpicture.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Auther: tlz
 * @Date: 2018/9/17 22:27
 * @Description:
 */
@RestController
public class ImgController {


    @RequestMapping("/getHello")
    public  String  getHello(){
        return  "Hello";
    }

    @RequestMapping("/upload")
    public static String uploadFileToHbase( MultipartFile file) throws IOException {




        return "ok";
    }

}
