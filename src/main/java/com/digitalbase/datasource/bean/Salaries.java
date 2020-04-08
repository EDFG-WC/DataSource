package com.digitalbase.datasource.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
public class Salaries {
    private Integer empNo;

    private Integer salary;

    private Date fromDate;

    private Date toDate;
}