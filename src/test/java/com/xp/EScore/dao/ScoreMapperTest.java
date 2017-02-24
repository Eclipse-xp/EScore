package com.xp.EScore.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ScoreMapperTest {

    @Autowired
    private ScoreMapper scoreMapper;

    @Test
    public void queryList() {
        Calendar calendar = Calendar.getInstance();
        Date examDate = calendar.getTime();
        String classId = "TSZ1506";
        try {
            List<Map<String, Object>> result = this.scoreMapper.queryList(
                examDate, classId);
            Assert.assertTrue(result.toString(), !result.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
