package com.odiy.domain.mapper.j99.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShopBaseInfo implements Serializable {
    private Integer shopId;

    private String shopName;

    private String shopPostno;

    private String shopAddr;

    private String shopOrderDiv;

    private String shopTel;

    private Date addDate;

    private static final long serialVersionUID = 1L;
}