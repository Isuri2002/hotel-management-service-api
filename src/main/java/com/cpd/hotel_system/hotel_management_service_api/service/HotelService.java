package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequsetHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.Paginate.HotelPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;

import java.sql.SQLException;

public interface HotelService {

    public void create(RequsetHotelDto dto);
    public void update(RequsetHotelDto dto, String hotelId) throws SQLException; //to finde the hotel we need the id
    public void delete(String hotelId);
    public ResponseHotelDto findById(String hotelId) throws SQLException;
    public HotelPaginateResponseDto findAll(int page, int size, String searchText);
}
