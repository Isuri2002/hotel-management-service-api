package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import com.cpd.hotel_system.hotel_management_service_api.entity.Branch;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseHotelDto {
    private String hotelId;
    private String hotelName;
    private boolean activeStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String description; //even if this saved in db as blob we can use string because in website this render as html
    private int starRating;
    private BigDecimal startingFrom;
    private List<ResponseBranchDto> branches;
}
