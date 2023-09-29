package com.test.Testshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("v1")//maps http requests to this
public class TestController {
    @Autowired TestServices testServices;

    @PostMapping("create")
    public HashMap<String, Object> map (@RequestBody Test test){
        HashMap<String, Object> map = new HashMap<>();
        boolean post = testServices.create(test);
        if(post){
            map.put("Success",true);
            map.put("Message","Details added successfully");
        }else{
            map.put("Success",false);
            map.put("Message","Failed to add Details");
        }
        return map;
    }

    @GetMapping("list")
    public HashMap<String, Object> map (){
        HashMap<String, Object> map = new HashMap<>();
        List<Test> test = testServices.listOf();
        if(test.isEmpty()){
            map.put("Success",true);
            map.put("Message","Details not found");
        }else{
            map.put("Success",false);
            map.put("Message",test);
        }
        return map;
    }

    @PutMapping("/update/{id}")
    public HashMap<String, Object> map (@RequestBody Test test, @PathVariable Long id) {
        HashMap<String, Object> map = new HashMap<>();
        boolean redo = testServices.updateTest(id, test);
        if (redo) {
            map.put("Success", true);
            map.put("Message", "stock not found");
        } else {
            map.put("Success", false);
            map.put("data", "Failed to update");
        }
        return map;
    }

    @DeleteMapping("/delete/{id}")
    public HashMap<String, Object> map (@PathVariable Long id) {
        HashMap<String, Object> map = new HashMap<>();
        boolean del = testServices.deleteTest(id);
        if (del) {
            map.put("Success", true);
            map.put("Message", "deleted successfully");
        } else {
            map.put("Success", false);
            map.put("data", "Failed to delete");
        }
        return map;
    }

}
