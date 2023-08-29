package com.horseman.kahani.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horseman.kahani.dao.Dao;
import com.horseman.kahani.models.Story;

@Service
public class SService {

    @Autowired
    Dao dao;

    public List<Story> getAllStory() {
        return dao.findAll();
    }

    public Optional<Story> getStoryById(Integer id) {
        return dao.findById(id);
    }

    public String postStory(Story story) {
        try {
            dao.save(story);
            return "posted...";
        } catch (Exception e) {
            return e.getStackTrace().toString();
        }
    }

}
