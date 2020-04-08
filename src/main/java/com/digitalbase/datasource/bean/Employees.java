package com.digitalbase.datasource.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
public class Employees {
    @TableId
    private Integer empNo;

    private Date birthDate;

    private String firstName;

    private String lastName;

    private String gender;

    private Date hireDate;
}