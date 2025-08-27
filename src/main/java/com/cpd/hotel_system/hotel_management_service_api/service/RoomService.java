package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.Paginate.RoomPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomDto;


public interface RoomService {

    public void create(RequestRoomDto dto);
    public void update(RequestRoomDto dto, String roomId); //to finde the hotel we need the id
    public void delete(String roomId);
    public ResponseRoomDto findById(String roomId);
    public RoomPaginateResponseDto findAll(int page, int size);
}
