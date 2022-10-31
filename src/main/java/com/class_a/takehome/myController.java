/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.class_a.takehome;


import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ABID
 */
@Controller
public class myController {
    @RequestMapping("/input")
    public String getInput(
            @RequestParam(value = "nama") String var_nama,
            @RequestParam(value = "lokasi") String var_lokasi,
            @RequestParam(value = "gambar") MultipartFile var_image,Model hiling
        )throws IOException{
        byte[] img = var_image.getBytes();
        String base64Image = Base64.encodeBase64String(img);
        String imglink = "data:image/*;base64,".concat(base64Image);
        hiling.addAttribute("send_nama", var_nama);
        hiling.addAttribute("send_lokasi", var_lokasi);
        hiling.addAttribute("send_image", imglink);
        return "viewpage";
        
    }
}
