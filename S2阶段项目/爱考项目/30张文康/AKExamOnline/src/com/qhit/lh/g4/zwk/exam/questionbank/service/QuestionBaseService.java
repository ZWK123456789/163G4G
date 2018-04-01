/**
 * 
 */
package com.qhit.lh.g4.zwk.exam.questionbank.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.qhit.lh.g4.zwk.exam.common.bean.PageBean;
import com.qhit.lh.g4.zwk.exam.questionbank.bean.WrittenTest;
import com.qhit.lh.g4.zwk.exam.subjectmana.bean.Course;

/**
 * @author ZWK
 *2018年1月3日下午6:00:52
 *TODO
 */
public interface QuestionBaseService {

	public List<Object> getCourseInfo(Map<String,String> parameter);
	public PageBean<WrittenTest> getWrittenQuestion(PageBean<WrittenTest> pagebean, Course course,int pageIndex);
	public void addWritten(WrittenTest written);
	public void inportWrittenQuestions(List<WrittenTest> writtenQuestionList);
	public WrittenTest getWrittenQuestionById(Class clazz,Serializable i);
	public void updateWrittenQuestion(WrittenTest written);
	
}
