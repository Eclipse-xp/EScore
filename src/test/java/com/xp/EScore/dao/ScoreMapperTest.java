package com.xp.EScore.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xp.EScore.base.TestBase;

public class ScoreMapperTest extends TestBase {

    @Autowired
    private ScoreMapper scoreMapper;

    @Test
    public void queryList() throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date examDate = sf.parse("2017-02-24");
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
