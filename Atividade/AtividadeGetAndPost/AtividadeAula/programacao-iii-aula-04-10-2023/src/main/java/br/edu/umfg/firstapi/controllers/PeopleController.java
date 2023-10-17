package br.edu.umfg.firstapi.controllers;

import br.edu.umfg.entities.People;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/people")
public class PeopleController {

    private ArrayList<People> list = new ArrayList<People>();

    @GetMapping
    public ResponseEntity<ArrayList<People>> getPeople() {
        for (People people : list) {
            return ResponseEntity.ok(list);
        }
        return ResponseEntity.badRequest().body(null);
    }

    @PostMapping
    public ResponseEntity<People> postPeople(@RequestBody People people){
        this.list.add(people);

        return ResponseEntity.ok(people);
    }
}
