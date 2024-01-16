package com.firstproject.FirstprojectSpringboot;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;


@RestController
@RequestMapping("/users")
public class GreetingController {

    private final Repository userRepository;

    public GreetingController(Repository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getUserById(@PathVariable Long id) {
        Optional<Customer> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {
            return ResponseEntity.ok(optionalUser.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PutMapping("/{id}/email")
    public ResponseEntity<Customer> updateUserEmail(@PathVariable Long id, @RequestBody String email) {
        Optional<Customer> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {
            Customer user = optionalUser.get();
            user.setEmail(email);
            userRepository.save(user);

            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        Optional<Customer> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {
            userRepository.deleteById(id);
            return ResponseEntity.ok("User deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody Customer user) {
        Map<String, String> validationErrors = validateUser(user);
        if (!validationErrors.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(validationErrors);
        }

        Customer createdUser = userRepository.save(user);
        return ResponseEntity.ok(createdUser);
    }

    private Map<String, String> validateUser(Customer user) {
        Map<String, String> validationErrors = new HashMap<>();

        if (StringUtils.isEmpty(user.getName())) {
            validationErrors.put("name", "Name field is required");
        }

        if (StringUtils.isEmpty(user.getEmail())) {
            validationErrors.put("email", "Email field is required");
        }

        return validationErrors;
    }
}