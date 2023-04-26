package com.koba.cevalev;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class ApartmentController {

    @PostMapping("/get/{id}")
    public ResponseEntity<ApartmentDto> getApartmentById(@PathVariable("id") int id) {
        ApartmentDto apartment = new ApartmentDto();

        return new ResponseEntity<>(apartment, HttpStatus.OK);
    }
}