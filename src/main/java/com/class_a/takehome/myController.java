/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.class_a.takehome;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ABID
 */
@Controller
public class myController {
    @RequestMapping("/input")
    public String getInput(HttpServletRequest data, Model hiling){
        String nama = data.getParameter("var_nama");
        String lokasi = data.getParameter("var_lokasi");
        String img = data.getParameter("var_img");
        
        hiling.addAttribute("nama",nama);
        hiling.addAttribute("lokasi",lokasi);
        hiling.addAttribute("img",img);
        
        return "rslt";
    }
}
