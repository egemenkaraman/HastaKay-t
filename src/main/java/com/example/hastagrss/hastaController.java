package com.example.hastagrss;

import org.hibernate.metamodel.mapping.internal.DiscriminatorTypeImpl;
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

    @PostMapping("/hastaEkle")
    public ResponseEntity<hastaEntity> addUser(@RequestBody hastaEntity hasta) {
        try{
            hastaEntity hastaEntity = new hastaEntity(hasta.getId(),hasta.getIsim(),hasta.getSoyisim(),hasta.getDoğumtarihi(),hasta.getCinsiyet(),hasta.getTelefon(),hasta.getMail(),hasta.getAdres(),hasta.getKayıt_tarihi(),hasta.getKimlik());
            hastaEntity savedHasta = hastaRepository.save(hastaEntity);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/hastaSil")
    public String deleteHasta(@RequestParam Integer id) {
        hastaEntity user = hastaRepository.findByid(id);
        if (user != null) {
            hastaRepository.delete(user);
            return "Kullanıcı başarıyla silindi";
        } else {
            return "Kullanıcı bulunamadı";
        }
    }

}
