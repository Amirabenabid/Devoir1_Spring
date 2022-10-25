package com.example.musique.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.musique.entities.Musique;
import com.example.musique.service.MusiqueService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTController {
@Autowired
MusiqueService musiqueService;
@RequestMapping(method = RequestMethod.GET)
public List<Musique> getAllProduits() {
return musiqueService.getAllMusiques();
}
}