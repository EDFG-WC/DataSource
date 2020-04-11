package com.digitalbase.datasource.beans.business;

import lombok.Data;

/**
 * @author Alex
 */
@Data public class ParamsBean {
    // 必须属性

    final private String dsName;
    final private int port;
    final private String taskId;
    final private String baseName;


    private String para1;
    private int para2;
}
