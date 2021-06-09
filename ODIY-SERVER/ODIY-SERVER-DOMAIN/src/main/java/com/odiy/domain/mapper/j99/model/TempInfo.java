package com.odiy.domain.mapper.j99.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TempInfo implements Serializable {
    private LocalDate date;

    private String uuid;

    private LocalDateTime validDatetime;

    private String value;

    private String type;

    private Integer canErrTimes;

    private Integer nowErrTimes;

    private static final long serialVersionUID = 1L;
}