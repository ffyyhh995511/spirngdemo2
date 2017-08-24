package org.fyh.spirngdemo2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.fyh.spirngdemo2.entity.Teacher;
import org.fyh.spirngdemo2.vo.TeacherVo;

public interface TeacherMapper {
    int deleteByPrimaryKey(String id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
    
    List<Teacher> searchByName(@Param("name")String name);

	int insertBatch(List<Teacher> list);

	int deleteBatch(String array[]);
    
    List<TeacherVo> queryDetails();

	List<Teacher> pageQuery();
}