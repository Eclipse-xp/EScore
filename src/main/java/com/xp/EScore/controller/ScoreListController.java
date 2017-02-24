package com.xp.EScore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xp.EScore.common.bean.ResponseResult;

@Controller
public class ScoreListController {

    /**
     * @param classId
     * @param examDate
     * @param distant
     * @return
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/scorelist")
    public ResponseResult<Object> queryScoreList(@RequestParam Integer classId,
            @RequestParam String examDate,
            @RequestParam(required = false) Integer distant) {
        ResponseResult<Object> result = new ResponseResult<>();

        return result;
    }

}
