package com.xp.EScore.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xp.EScore.common.bean.ResponseResult;
import com.xp.EScore.service.ScoreService;

/**
 * @author xiexiangpeng
 */

@Controller
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    /**
     * @param classId
     * @param examDate
     * @param distant
     * @return
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public ResponseResult<Object> queryScoreList(@RequestParam String classId,
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date examDate,
            @RequestParam(required = false) Integer distant) {
        ResponseResult<Object> result = new ResponseResult<>();
        result.setResult(this.scoreService.queryList(examDate, classId));
        return result;
    }

    /**
     * @param studentId
     * @return
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/rankHistory")
    public ResponseResult<Object> queryRankHistory(
            @RequestParam String studentId) {
        ResponseResult<Object> result = new ResponseResult<>();
        result.setResult(this.scoreService.queryClassRankHistory(studentId));
        return result;
    }

}
