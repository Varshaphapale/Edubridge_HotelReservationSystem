package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.RoomEntity;

public interface RoomService
{
	//addRooms
	public RoomEntity addRoom(RoomEntity room);
	
	//getAllProducts
	public List<RoomEntity> getAllRoom();
	
	//updateRoomById
	public RoomEntity updateRoomById(long roomId,RoomEntity room);
	
	//deleteRoomById
	public String deleteRoomById(long roomId);
	
	//getById
	public RoomEntity getRoomById(long roomId);
	
	//getAllRoomById
	public List<RoomEntity> getAllRoomById();

	Long[] getAllRoomId();

	String deleteroomById(long roomId);

	List<RoomEntity> getAllRoomByiId();

	
	
	
}