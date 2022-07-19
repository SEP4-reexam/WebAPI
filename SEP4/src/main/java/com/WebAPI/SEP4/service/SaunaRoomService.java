package com.WebAPI.SEP4.service;

import com.WebAPI.SEP4.entities.SaunaRoom;

import java.util.List;

public interface SaunaRoomService {
    List<SaunaRoom> findAllSaunaRooms();
    SaunaRoom saveSaunaRoom(SaunaRoom saunaRoom);
    SaunaRoom updateSaunaRoom(SaunaRoom saunaRoom);

}
