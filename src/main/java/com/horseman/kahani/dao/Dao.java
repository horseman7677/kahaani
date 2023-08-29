package com.horseman.kahani.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.horseman.kahani.models.Story;

public interface Dao extends JpaRepository<Story, Integer> {

}