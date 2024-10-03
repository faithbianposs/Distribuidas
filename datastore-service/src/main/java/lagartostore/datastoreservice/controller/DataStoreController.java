package lagartostore.datastoreservice.controller;

import lagartostore.datastoreservice.entity.DataStore;
import lagartostore.datastoreservice.service.DataStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/datastore")
public class DataStoreController {
    @Autowired
    private DataStoreService dataStoreService;

    @GetMapping
    public ResponseEntity<List<DataStore>> list() {
        return ResponseEntity.ok(dataStoreService.list());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<DataStore>> getById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok(dataStoreService.getById(id));
    }

    @PostMapping
    public ResponseEntity<DataStore> save(@RequestBody DataStore dataStore) {
        return ResponseEntity.ok(dataStoreService.save(dataStore));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DataStore> update(@PathVariable(required = true) Integer id, @RequestBody DataStore dataStore) {
        return ResponseEntity.ok(dataStoreService.update(id, dataStore));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<DataStore>> delete(@PathVariable(required = true) Integer id) {
        dataStoreService.delete(id);
        return ResponseEntity.ok(dataStoreService.list());
    }
}