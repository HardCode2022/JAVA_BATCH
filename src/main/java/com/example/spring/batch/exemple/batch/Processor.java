package com.example.spring.batch.exemple.batch;

import com.example.spring.batch.exemple.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<User, User> {

    private static  final Map<String , String> DEPT= new HashMap<>();

    public Processor(){
        DEPT.put("0045","Loiret");
        DEPT.put("0043","Ile Canari");
        DEPT.put("0047","Pays de la loire");
        DEPT.put("0056","Bretagne");
        DEPT.put("0071","Ile Maurice");
    }

    @Override
    public User process(User user) throws Exception {
        String codeDept = user.getDepartement();
        String dept =DEPT.get(codeDept);
        user.setDepartement(dept);
        user.setDate_Execution(new Date());
        System.out.println(String.format("Convertion de [%s] à [%s]", codeDept,dept));
        return user;
    }
}
