package com.xp.EScore.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xp.EScore.base.TestBase;

public class ScoreMapperTest extends TestBase {

    @Autowired
    private ScoreMapper scoreMapper;

    private static final Logger logger = LogManager
        .getLogger(ScoreMapperTest.class.getName());

    @Test
    public void queryList() throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date examDate = sf.parse("2017-02-24");
        String classId = "TSZ1506";
        try {
            List<Map<String, Object>> result = this.scoreMapper.queryList(
                examDate, classId);
            logger.info(result.toString());
            Assert.assertTrue("queryList :", !result.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void queryClassRankList() {
        String studentId = "TSZ150405070Q";
        List<Map<String, Object>> result = this.scoreMapper
            .queryClassRankList(studentId);
        logger.info(result.toString());
        Assert.assertTrue("queryClassRankList :", !result.isEmpty());
    }

    @Test
    public void queryExamOfClassByStudentId() {
        String studentId = "TSZ150405070Q";
        List<Date> result = this.scoreMapper
                .queryExamOfClassByStudentId(studentId);
        logger.info(result.toString());
        Assert.assertTrue("queryExamOfClassByStudentId :", !result.isEmpty());
    }
}
