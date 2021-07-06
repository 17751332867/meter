package com.example.demo.service.impl;

import com.example.demo.dao.MeterDao;
import com.example.demo.service.MeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeterServiceImpl implements MeterService {
    @Autowired
    private MeterDao meterDao;
    @Override
    public void update(double value) {
        meterDao.update(value);
    }

    @Override
    public double get() {
        return meterDao.get();
    }
}
