package com.app.Tenant.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tenant")
public class TenantController {

        @GetMapping("/hello")
        public String hello(){
            return "Hello I am in tenant service";
        }

}
