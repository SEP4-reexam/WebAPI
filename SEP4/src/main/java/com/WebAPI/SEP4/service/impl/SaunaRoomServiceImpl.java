package com.WebAPI.SEP4.service.impl;

import com.WebAPI.SEP4.entities.SaunaRoom;
import com.WebAPI.SEP4.repository.SaunaRoomRepository;
import com.WebAPI.SEP4.service.SaunaRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaunaRoomServiceImpl implements SaunaRoomService{
    @Autowired
    private final SaunaRoomRepository saunaRoomRepository;

    public SaunaRoomServiceImpl(SaunaRoomRepository saunaRoomRepository) {
        this.saunaRoomRepository = saunaRoomRepository;
    }


    @Override
    public List<SaunaRoom> findAllSaunaRooms() {
        return saunaRoomRepository.findAll();
    }

    @Override
    public SaunaRoom saveSaunaRoom(SaunaRoom saunaRoom) {
        return saunaRoomRepository.save(saunaRoom);
    }

    @Override
    public SaunaRoom updateSaunaRoom(SaunaRoom saunaRoom) {
        return saunaRoomRepository.save(saunaRoom);
    }

}
