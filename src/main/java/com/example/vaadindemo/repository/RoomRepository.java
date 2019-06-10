package com.example.vaadindemo.repository;

import com.example.vaadindemo.entity.Room;

import java.util.List;

public interface RoomRepository {

    List<Room> findAll() throws Exception;

    void save(Room room) throws Exception;

    void update(Room room) throws Exception;

    void delete(Integer id) throws Exception;

    Room findById(Integer id) throws Exception;
}
