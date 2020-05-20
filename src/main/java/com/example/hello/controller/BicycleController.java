package com.example.hello.controller;

import com.example.hello.entity.Bicycle;
import com.example.hello.service.BicycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bicycle")
public class BicycleController {
    @Autowired
    private BicycleService mService;

    @PostMapping(value = "/add")
    public Bicycle addBicycle(@RequestBody Bicycle bicycle)
    {
        return mService.addBicycle(bicycle);
    }

    @GetMapping(value = "/get/{bicycleId}")
    public Bicycle findBicycleById(@PathVariable("bicycleId") Integer bicycleId)
    {
        return mService.findBicycleById(bicycleId);
    }

    @PutMapping(value = "/update/{bicycleId}/{price:.+}")
    public Bicycle updateBicyclePrice(@PathVariable("bicycleId") Integer bicycleId, @PathVariable
            ("price") double updatedPrice)
    {
        return mService.updateBicyclePrice(bicycleId,updatedPrice);
    }

    @DeleteMapping(value = "/delete/{bicycleId}")
    public void deleteBicycle(@PathVariable("bicycleId") Integer bicycleId)
    {
        mService.deleteBicycle(bicycleId);
    }

}
