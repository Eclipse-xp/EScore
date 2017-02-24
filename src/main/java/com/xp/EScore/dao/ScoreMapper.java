package com.xp.EScore.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * @author xiexiangpeng
 */
public interface ScoreMapper {

    /**
     * @param examDate
     * @description
     *              get the score list
     */
    List<Map<String, Object>> queryList(@Param("examDate") Date examDate,
            @Param("classId") String classId);
}