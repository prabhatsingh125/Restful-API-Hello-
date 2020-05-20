package com.example.hello.service;

import com.example.hello.dao.BicycleRepository;
import com.example.hello.entity.Bicycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BicycleService {
    @Autowired
    private BicycleRepository mRepository;
    public Bicycle addBicycle(Bicycle bicycle)
    {
        return mRepository.save(bicycle);
    }

    public Bicycle findBicycleById(Integer bicycleId)
    {
        return mRepository.findById(bicycleId).get();
    }

    public Bicycle updateBicyclePrice(Integer bicycleId, double updatedPrice)
    {
        Bicycle temp=mRepository.findById(bicycleId).get();
        temp.setPrice(updatedPrice);
        return mRepository.save(temp);
    }

    public void deleteBicycle(Integer bicycleId)
    {
        mRepository.deleteById(bicycleId);
    }
}
