package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequsetHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.Paginate.HotelPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;

public interface HotelService {

    public void create(RequsetHotelDto dto);
    public void update(RequsetHotelDto dto, String hotelId); //to finde the hotel we need the id
    public void delete(String hotelId);
    public ResponseHotelDto findById(String hotelId);
    public HotelPaginateResponseDto findAll(int page, int size, String searchText);
}
