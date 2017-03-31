package com.xp.EScore.service;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xp.EScore.dao.ScoreMapper;
import com.xp.EScore.dao.StudentMapper;
import com.xp.EScore.po.Student;

/**
 * @author xiexiangpeng
 */

@Service
public class ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;
    @Autowired
    private StudentMapper studentMapper;

    public Map<String, Object> queryList(Date examDate, String classId) {
        Map<String, Object> m = new HashMap<>();
        List<Map<String, Object>> list = this.scoreMapper.queryList(examDate,
            classId);
        m.put("list", list);
        return m;
    }

    public Map<String, Object> queryClassRankHistory(String... studentIds) {
        Map<String, Object> m = new HashMap<>();
        List<Object> resultList = new LinkedList<>();
        for (String studentId : studentIds) {
            Map<String, Object> dataMap = new HashMap<>();
            List<Map<String, Object>> history = this.scoreMapper
                .queryClassRankList(studentId);
            Student student = this.studentMapper.selectById(studentId);
            dataMap.put("name", student.getName());
            dataMap.put("history", history);
            resultList.add(dataMap);
        }

        m.put("list", resultList);
        return m;
    }

}
