package com.example.user.Controller;

import com.example.user.Model.User;
import com.example.user.Repository.UserRepo;
import com.example.user.VO.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepo repo;

    @Autowired
    private RestTemplate restTemplate;
    @PostMapping("/save")
    public ResponseEntity<User> submitu(@RequestBody User user)
    {
        return ResponseEntity.ok().body(repo.save(user));
    }
    @GetMapping("/usr")
    public ResponseEntity<List<User>> getall()
    {
        return ResponseEntity.ok().body(repo.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> getbyid(@PathVariable int id)
    {
        return  ResponseEntity.ok().body(repo.findById(id));
    }
    @GetMapping("/dep")
    public ResponseTemplateVO getdept(int id)




}
