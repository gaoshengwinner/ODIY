package com.odiy.domain.mapper.j99.model;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ManaColor implements Serializable {
    private Integer tempId;

    private Integer id;

    private Integer shopId;

    private String name;

    private Byte isUse;

    private Double red;

    private Double green;

    private Double blue;

    private Double opacity;

    private static final long serialVersionUID = 1L;
}