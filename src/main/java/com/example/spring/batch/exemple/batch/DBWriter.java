package com.example.spring.batch.exemple.batch;

import com.example.spring.batch.exemple.model.User;
import com.example.spring.batch.exemple.repository.UserRepository;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<User>{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> userLists) throws Exception {
        System.out.println("Insertion des données en BDD" +userLists);
        userRepository.saveAllAndFlush(userLists);
    }
}
