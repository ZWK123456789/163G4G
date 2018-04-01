/**
 * 
 */
package com.qhit.lh.g4.zwk.exam.questionbank.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.qhit.lh.g4.zwk.exam.common.bean.PageBean;
import com.qhit.lh.g4.zwk.exam.questionbank.bean.WrittenTest;
import com.qhit.lh.g4.zwk.exam.questionbank.dao.impl.QuestionBaseDaoImpl;
import com.qhit.lh.g4.zwk.exam.questionbank.service.QuestionBaseService;
import com.qhit.lh.g4.zwk.exam.subjectmana.bean.Course;

/**
 * @author ZWK
 *2018年1月5日上午9:40:22
 *TODO
 */
public class QuestionBaseServiceImpl implements QuestionBaseService {

	
	private QuestionBaseDaoImpl qbdi = new QuestionBaseDaoImpl();
	
	@Override
	public List<Object> getCourseInfo(Map<String, String> parameter) {
		// TODO Auto-generated method stub
		return qbdi.getCourseInfo(parameter);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.exam.questionbank.service.QuestionBaseService#getWrittenQuestion(com.qhit.lh.g4.zwk.exam.subjectmana.bean.Course)
	 */
	@Override
	public PageBean<WrittenTest> getWrittenQuestion(PageBean<WrittenTest> pagebean, Course course,int pageIndex) {
		// TODO Auto-generated method stub
		return qbdi.getWrittenQuestion(pagebean, course, pageIndex);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.exam.questionbank.service.QuestionBaseService#addWritten(com.qhit.lh.g4.zwk.exam.questionbank.bean.WrittenTest)
	 */
	@Override
	public void addWritten(WrittenTest written) {
		// TODO Auto-generated method stub
		 qbdi.addWritten(written);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.exam.questionbank.service.QuestionBaseService#inportWrittenQuestions(java.util.List)
	 */
	@Override
	public void inportWrittenQuestions(List<WrittenTest> writtenQuestionList) {
		// TODO Auto-generated method stub
		qbdi.inportWrittenQuestions(writtenQuestionList);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.exam.questionbank.service.QuestionBaseService#getWrittenQuestionById(java.lang.Class, com.qhit.lh.g4.zwk.exam.questionbank.bean.WrittenTest)
	 */
	@Override
	public WrittenTest getWrittenQuestionById(Class clazz, Serializable i) {
		// TODO Auto-generated method stub
		return qbdi.getWrittenQuestionById(clazz, i);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zwk.exam.questionbank.service.QuestionBaseService#updateWrittenQuestion(com.qhit.lh.g4.zwk.exam.questionbank.bean.WrittenTest)
	 */
	@Override
	public void updateWrittenQuestion(WrittenTest written) {
		// TODO Auto-generated method stub
		qbdi.updateWrittenQuestion(written);
		
	}

}
