package org.fyh.spirngdemo2.vo;

import java.util.List;

import org.fyh.spirngdemo2.entity.Student;
import org.fyh.spirngdemo2.entity.Teacher;
import org.fyh.spirngdemo2.entity.TeacherInfo;

public class TeacherVo extends Teacher {
	
	/**
	 * 一对多关联
	 */
	private List<Student> students;
	
	/**
	 * 一对一关联
	 */
	private TeacherInfo teacherInfo;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public TeacherInfo getTeacherInfo() {
		return teacherInfo;
	}

	public void setTeacherInfo(TeacherInfo teacherInfo) {
		this.teacherInfo = teacherInfo;
	}
	
	
}
