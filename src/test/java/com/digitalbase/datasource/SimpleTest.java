package com.digitalbase.datasource;

import com.digitalbase.datasource.bean.Salaries;
import com.digitalbase.datasource.dao.SalariesMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class) @SpringBootTest public class SimpleTest {
    @Resource private SalariesMapper salariesMapper;

    @Test
    public void select() {
        List<Salaries> list = salariesMapper.selectList(null);
        System.out.println(list.size());
    }
}
