package com.mibo2000.kcdemo.kcpub;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class Controller {
    @GetMapping
    public ResponseEntity<?> getPublic() {
        return ResponseEntity.ok(null);
    }
    @PostMapping
    public ResponseEntity<?>  postPublic() {
        return ResponseEntity.ok(null);
    }
    @PutMapping
    public ResponseEntity<?>  putPublic() {
        return ResponseEntity.ok(null);
    }
    @DeleteMapping
    public ResponseEntity<?>  deletePublic() {
        return ResponseEntity.ok(null);
    }
}
