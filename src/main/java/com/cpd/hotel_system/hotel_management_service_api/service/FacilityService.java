package com.cpd.hotel_system.hotel_management_service_api.service;


import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestFacilityDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.Paginate.FacilityPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseFacilityDto;

public interface FacilityService {

    public void create(RequestFacilityDto dto);
    public void update(RequestFacilityDto dto, String failityId); //to finde the hotel we need the id
    public void delete(String facilityId);
    public ResponseFacilityDto findById(String facilityId);
    public FacilityPaginateResponseDto findAll(int page, int size, String RoomId);
}
