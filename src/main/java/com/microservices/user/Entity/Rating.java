package com.microservices.user.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    private Long ratingId;
    private Long userId;
    private Long hotelId;
    private int rating;
    private String feedback;

}
