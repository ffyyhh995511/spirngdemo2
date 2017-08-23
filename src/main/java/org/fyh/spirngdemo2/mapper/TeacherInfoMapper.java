package org.fyh.spirngdemo2.mapper;

import org.fyh.spirngdemo2.entity.TeacherInfo;

public interface TeacherInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(TeacherInfo record);

    int insertSelective(TeacherInfo record);

    TeacherInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TeacherInfo record);

    int updateByPrimaryKey(TeacherInfo record);
}