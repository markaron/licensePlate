package com.greenfoxacademy.numberplate.controller;

import com.greenfoxacademy.numberplate.service.PlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlateController {

  @Autowired
  PlateService plateService;

  @GetMapping("/")
  public String searchPage(Model model){
    model.addAttribute("plates", plateService.findAllPlates());
    return "index";
  }

  @GetMapping("/search")
  public String search(@RequestParam(name = "q") String searchString, Model model){
    model.addAttribute("plates",plateService.findAllBySearch(searchString));
    return "index";
  }
}
