package com.xp.EScore.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xp.EScore.base.TestBase;
import com.xp.EScore.common.bean.ResponseResult;

public class ScoreControllerTest extends TestBase {

    @Autowired
    private ScoreController scoreController;

    private static final Logger logger = LogManager
        .getLogger(ScoreControllerTest.class.getName());

    @Test
    public void queryScoreList() throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date examDate = sf.parse("2017-02-24");
        String classId = "TSZ1506";
        ResponseResult<Object> obj = this.scoreController.queryScoreList(
            classId, examDate, null);
        JSONObject json = (JSONObject) JSON.toJSON(obj);
        logger.info(json.toString());
        Assert.assertTrue("queryScoreList Ê§°Ü", json != null && !json.isEmpty());
    }

    @Test
    public void queryRankHistory() {
        String studentId = "TSZ150405070Q";
        ResponseResult<Object> obj = this.scoreController
            .queryRankHistory(studentId);
        JSONObject json = (JSONObject) JSON.toJSON(obj);
        logger.info(json.toString());
        Assert.assertTrue("queryRankHistory Ê§°Ü",
            json != null && !json.isEmpty());
    }

}
