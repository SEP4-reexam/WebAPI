package com.WebAPI.SEP4.controller;

import com.WebAPI.SEP4.entities.SaunaRoom;
import com.WebAPI.SEP4.service.SaunaRoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sauna")
public class SaunaRoomController {
    private final SaunaRoomService saunaRoomService;


    public SaunaRoomController(SaunaRoomService saunaRoomService) {
        this.saunaRoomService = saunaRoomService;
    }
    @GetMapping
    public List<SaunaRoom> findAllSaunaRooms(){
        return saunaRoomService.findAllSaunaRooms();
    }
    @PostMapping
    public SaunaRoom saveSaunaRoom(@RequestBody SaunaRoom SaunaRoom){
        return saunaRoomService.saveSaunaRoom(SaunaRoom);
    }
    @PutMapping
    public SaunaRoom updateSaunaRoom(@RequestBody SaunaRoom SaunaRoom){
        return saunaRoomService.updateSaunaRoom(SaunaRoom);
    }

}
