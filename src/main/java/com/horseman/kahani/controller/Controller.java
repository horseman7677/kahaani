package com.horseman.kahani.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.horseman.kahani.models.Story;
import com.horseman.kahani.service.SService;

@CrossOrigin
@RestController
@RequestMapping("kahaani")
public class Controller {

    @Autowired
    SService service;

    @GetMapping("all-story")
    public List<Story> test() {
        return service.getAllStory();
    }

    @GetMapping("byId/{id}")
    public Optional<Story> getStoryById(@PathVariable Integer id)
    {
        return service.getStoryById(id);
    }

    @PostMapping("post")
    public String postStory(@RequestBody Story story)
    {
        return service.postStory(story);
    }
}
