package com.github.sammejanderson.StudyAssistApp.controller;

import com.github.sammejanderson.StudyAssistApp.service.FlashcardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/")
public class HomeController {

    private FlashcardService flashcardService;

    @GetMapping
    public ModelAndView home(){
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home.html");
        modelAndView.addObject("allCards", flashcardService.listAllCards());
        return modelAndView;
    }
}
