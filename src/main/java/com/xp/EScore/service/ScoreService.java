package com.xp.EScore.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xp.EScore.dao.ScoreMapper;

/**
 * @author xiexiangpeng
 */

@Service
public class ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    public Map<String, Object> queryList(Date examDate, String classId) {
        Map<String, Object> m = new HashMap<>();
        List<Map<String, Object>> list = this.scoreMapper.queryList(examDate,
            classId);
        m.put("list", list);
        return m;
    }

    public Map<String, Object> queryClassRankHistory(String studentId) {
        Map<String, Object> m = new HashMap<>();
        List<Map<String, Object>> list = this.scoreMapper
            .queryClassRankList(studentId);
        m.put("list", list);
        return m;
    }

}
