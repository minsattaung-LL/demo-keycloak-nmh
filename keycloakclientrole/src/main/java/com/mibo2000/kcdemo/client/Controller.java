package com.mibo2000.kcdemo.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class Controller {
    @GetMapping
    public ResponseEntity<?>  getKeycloakClient() {
        return ResponseEntity.ok(null);
    }
    @PostMapping
    public ResponseEntity<?>  postKeycloakClient() {
        return ResponseEntity.ok(null);
    }
    @PutMapping
    public ResponseEntity<?>  putKeycloakClient() {
        return ResponseEntity.ok(null);
    }
    @DeleteMapping
    public ResponseEntity<?>  deleteKeycloakClient() {
        return ResponseEntity.ok(null);
    }
}
