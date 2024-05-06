package com.mibo2000.kcdemo.realm;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class Controller {
    @GetMapping
    public ResponseEntity<?> getKeycloakRealm() {
        return ResponseEntity.ok(null);
    }
    @PostMapping
    public ResponseEntity<?>  postKeycloakRealm() {
        return ResponseEntity.ok(null);
    }
    @PutMapping
    public ResponseEntity<?>  putKeycloakRealm() {
        return ResponseEntity.ok(null);
    }
    @DeleteMapping
    public ResponseEntity<?>  deleteKeycloakRealm() {
        return ResponseEntity.ok(null);
    }
}
