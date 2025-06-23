package com.waracle.CakeManager.controller;

import com.waracle.CakeManager.model.CakeDto;
import com.waracle.CakeManager.service.CakeManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cakes")
public class CakeManagerController {

    private final CakeManagerService cakeManagerService;

    @Autowired
    public CakeManagerController(CakeManagerService cakeManagerService){
        this.cakeManagerService = cakeManagerService;
    }

    @GetMapping()
    public ResponseEntity<List<CakeDto>> getCakes(){
        return new ResponseEntity<>(cakeManagerService.fetchCakeList(), HttpStatus.OK);
    }

    @PostMapping(path = "/add", produces = "application/json")
    public ResponseEntity<List<CakeDto>> addCake(@RequestBody final CakeDto cakeDto){
        try{
            return new ResponseEntity<>(cakeManagerService.addCake(cakeDto), HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(path = "/update")
    public ResponseEntity<List<CakeDto>> updateCake(@RequestBody final CakeDto cakeDto){
        try{
            return new ResponseEntity<>(cakeManagerService.updateCake(cakeDto), HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping()
    public ResponseEntity<List<CakeDto>> deleteCake(@RequestBody final CakeDto cakeDto){
        try{
            return new ResponseEntity<>(cakeManagerService.deleteCake(cakeDto), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
