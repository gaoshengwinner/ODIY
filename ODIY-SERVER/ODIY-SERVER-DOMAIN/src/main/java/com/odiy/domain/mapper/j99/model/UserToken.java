package com.odiy.domain.mapper.j99.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserToken implements Serializable {
    private Integer memberId;

    private String deviceId;

    private String refreshToken;

    private LocalDateTime refreshTokenLimit;

    private String accessToken;

    private LocalDateTime accessTokenLimit;

    private static final long serialVersionUID = 1L;
}