package com.digitalbase.datasource.service;

import com.digitalbase.datasource.beans.business.ParseState;

public interface ParseManagerService {
   ParseState basicParse(String taskId);
}
