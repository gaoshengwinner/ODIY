package com.odiy.domain.mapper.j99.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShopAdditionInfo implements Serializable {
    private Integer shopId;

    private Integer ver;

    private Integer updateMemberId;

    private LocalDateTime updateDatetime;

    private String value;

    private static final long serialVersionUID = 1L;
}