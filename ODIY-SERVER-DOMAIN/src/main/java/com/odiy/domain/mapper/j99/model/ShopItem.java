package com.odiy.domain.mapper.j99.model;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShopItem implements Serializable {
    private Integer id;

    private Integer shopId;

    private Integer orderIndex;

    private String itemName;

    private Integer itemPrice;

    private String itemDescr;

    private String itemMainPicUrl;

    private String itemDispDetail;

    private static final long serialVersionUID = 1L;
}