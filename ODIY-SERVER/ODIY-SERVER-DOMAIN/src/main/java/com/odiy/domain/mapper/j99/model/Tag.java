package com.odiy.domain.mapper.j99.model;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tag implements Serializable {
    private Integer id;

    private Integer shopId;

    private Integer orders;

    private String descr;

    private String data;

    private String property;

    private static final long serialVersionUID = 1L;
}