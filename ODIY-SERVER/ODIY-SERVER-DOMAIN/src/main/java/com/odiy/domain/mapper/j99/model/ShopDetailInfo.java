package com.odiy.domain.mapper.j99.model;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShopDetailInfo implements Serializable {
    private Integer shopId;

    private Integer detailId;

    private String detailComment;

    private String detailText;

    private String detailImgId;

    private static final long serialVersionUID = 1L;
}