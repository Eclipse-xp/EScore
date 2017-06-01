package com.xp.EScore.service;

import java.util.*;

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

    /**
     *  notes:
     *  1.if someone is absent in one or more exam,the result will have some mistakes
     *  in webpage at X-axis,so we should handle the case.
     *  (updete:don't need to handle this case,because if someone had an absence,he will got the last rank.
     *  but,if we have a tansfer,the result will still show wrong at X-axis.
     *  For a long consideration,I plan to handle it in the "Manage System" in the future.)
     *  2.consider students in a same "class" only(to be improved to hold different classes)
     *
     * @param studentIds
     * @return
     *
     */
    public Map<String, Object> queryClassRankHistory(String... studentIds) {
        if(studentIds == null || studentIds.length == 0){
            return null;
        }
        Map<String, Object> m = new HashMap<String, Object>();
        List<Object> resultList = new LinkedList<Object>();
//        List<Date> examDateList = this.scoreMapper.queryExamOfClassByStudentId(studentIds[0]);
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

    public Map<String, Object> queryExamOfClassByStudentId(String studentId) {
        Map<String, Object> m = new HashMap<>();
        List<Date> examDateList = this.scoreMapper.queryExamOfClassByStudentId(studentId);
        m.put("list", examDateList);
        return m;
    }
}
