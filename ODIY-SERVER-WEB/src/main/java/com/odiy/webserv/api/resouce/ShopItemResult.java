package com.odiy.webserv.api.resouce;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShopItemResult {
	
    private Integer id;
//
//    private Integer shopId;
//
//    private Integer orderIndex;

    private String itemName;

    private String itemPrice;

    private String itemDescr;

    private String itemMainPicUrl;
    
    private String itemDispDetail;

}
