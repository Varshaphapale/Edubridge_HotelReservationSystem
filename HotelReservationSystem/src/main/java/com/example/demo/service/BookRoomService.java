package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.BookRoomEntity;
import com.example.demo.entity.UserEntity;

public interface BookRoomService 
{
	//addBuyRoom
	public BookRoomEntity addBookRoom(BookRoomEntity bookRoom);
	
	//getBuyRoomById
	public BookRoomEntity getBookRoomById(long id);
	
	//deleteBuyRoomById
	public String deleteBookRoomById(long id);
	
	//getBuyRoomByEmail
	public List<BookRoomEntity> getBookRoomByEmail(String userEmail);
	
	//getBuyRoomByProductId
	public List<BookRoomEntity> getBookRoomByRoomId(long roomId);
	
	//public List<BookRoomEntity>getAllBookRoom();
	
	//public List<BookRoomEntity>getAllBookRoom();
	public List<BookRoomEntity> getAllBookRoom();
	
	
	
}