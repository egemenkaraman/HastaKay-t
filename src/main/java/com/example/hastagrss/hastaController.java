package com.example.hastagrss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class hastaController {
    @Autowired
    hastaRepository hastaRepository;

    @GetMapping("/getTable")
    public List<hastaEntity> getTable(){
        return hastaRepository.findAll();
    }
/*
    @PostMapping("/hastaekle")
    public ResponseEntity<hastaEntity> addUser(@RequestBody hastaEntity hasta) {
        try{
            hastaEntity hastaEntity = new hastaEntity(hasta.getKimlik(), hasta.getAdres(),hasta.getTelefon(),hasta.getId(),hasta.getCinsiyet(),hasta.getDoğumtarihi(),hasta.getKayıt_tarihi(),hasta.getIsim(),hasta.getSoyisim(),hasta.getMail());
            hastaEntity savedHasta = hastaRepository.save(hastaEntity);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
*/
}
