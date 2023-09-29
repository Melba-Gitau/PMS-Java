package com.test.Testshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestServices {
    @Autowired TestRepo testRepo;

    public boolean create(Test test){
        try{
            testRepo.save(test);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public List<Test> listOf(){
        return testRepo.findAll();
    }

    public boolean updateTest(Long id, Test test){
        Optional<Test> scene = testRepo.findById(id);
        if(scene.isPresent()){
           Test updated  = scene.get();
           updated.setName(test.getName());
           updated.setEmail(test.getEmail());
           updated.setPhone(test.getPhone());
           testRepo.save(test);
           return true;
        }else {
            return false;
        }
    }

    public boolean deleteTest(Long id){
        Optional<Test> scene = testRepo.findById(id);
        if(scene.isPresent()){
            testRepo.delete(scene.get());
            return true;
        }else{
            return false;
        }
    }
}
