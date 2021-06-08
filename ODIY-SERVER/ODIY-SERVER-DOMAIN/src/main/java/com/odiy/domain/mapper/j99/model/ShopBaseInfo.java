package com.odiy.domain.mapper.j99.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShopBaseInfo implements Serializable {
    private Integer shopId;

    private Integer memberId;

    private String shopName;

    private String shopAddr;

    private String shopTel;

    private LocalDateTime addDate;

    private String shopPicUrl;

    private static final long serialVersionUID = 1L;
}