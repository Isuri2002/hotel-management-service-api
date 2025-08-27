package com.cpd.hotel_system.hotel_management_service_api.service;


import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.Paginate.RoomImagePaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomImageDto;

public interface RoomImageService {

    public void create(RequestRoomImageDto dto);
    public void update(RequestRoomImageDto dto, String imageId); //to finde the hotel we need the id
    public void delete(String imageId);
    public ResponseRoomImageDto findById(String imageId);
    public RoomImagePaginateResponseDto findAll(int page, int size, String roomId);
}
