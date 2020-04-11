package com.digitalbase.datasource.service.impl;

import com.digitalbase.datasource.beans.business.FileTypeEnum;
import com.digitalbase.datasource.beans.business.ParseState;
import com.digitalbase.datasource.service.ParseManagerService;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class BasicParseServiceImpl implements ParseManagerService {
    @Value("${parse-file-path}") private String commonFilePath;

    @Override public ParseState basicParse(String taskId) {
        new StringBuffer();
        File taskDir = new File(commonFilePath + System.getProperty("file.separator") + taskId);
        // 解析步骤先不写, 假设所有文件都没有压缩过
        final File[] taskFiles = taskDir.listFiles();
        Set<FileTypeEnum> typeList = new HashSet<>();
        for (File file : taskFiles) {
            if (file.isDirectory()) {
                switch (file.getName().substring(file.getName().lastIndexOf(".")).toLowerCase(Locale.ENGLISH)) {
                    case "xml":
                        break;
                    case "csv":
                        break;
                    case "txt":
                        break;
                }
            }
        } return null;
    }
}
