package com.company.delivery.controllers;

import com.company.delivery.DTOs.OrderResponseDTO;
import com.company.delivery.services.SalesmanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/user")
public class SalesmanController {

    @Autowired
    private SalesmanService salesmanService;

    @GetMapping("/view-food")
    public List<OrderResponseDTO> viewFood() {
        return salesmanService.viewFood();
    }

    @GetMapping("/")
    public String status() {
        return "Ok";
    }
//    @PostMapping()
//    public ResponseEntity<Object> saveUser(@RequestBody @Valid UserDto userDto) {
//        var salesmanModel = new SalesmanModel();
//
//        BeanUtils.copyProperties(userDto, salesmanModel);
//        salesmanModel.setCreateAt(LocalDateTime.now(ZoneId.of("UTC")));
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(this.salesmanService.save(salesmanModel));
//    }
}