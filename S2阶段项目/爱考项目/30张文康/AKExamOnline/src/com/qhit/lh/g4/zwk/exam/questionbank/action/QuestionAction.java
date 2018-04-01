/**
 * 
 */
package com.qhit.lh.g4.zwk.exam.questionbank.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.zwk.exam.common.bean.PageBean;
import com.qhit.lh.g4.zwk.exam.questionbank.bean.MachineTest;
import com.qhit.lh.g4.zwk.exam.questionbank.bean.WrittenTest;
import com.qhit.lh.g4.zwk.exam.questionbank.service.impl.QuestionBaseServiceImpl;
import com.qhit.lh.g4.zwk.exam.questionbank.utils.PoireadExcel;
import com.qhit.lh.g4.zwk.exam.subjectmana.bean.Course;

/**
 * @author ZWK
 *2018年1月3日下午5:50:28
 *TODO
 */
public class QuestionAction extends ActionSupport {

	private String major;
	private String stage;
	private Course course;
	private MachineTest machine = new MachineTest();
	private WrittenTest written = new WrittenTest()  ;
	private PageBean<WrittenTest> pagebean = new PageBean<WrittenTest>();
	private QuestionBaseServiceImpl qbsi = new QuestionBaseServiceImpl();
	private List<Object> QuestionAllList = new ArrayList<>();
	private List<WrittenTest> listWQuestions = new ArrayList<>();
	private File questionfile;
	private int pageIndex;
	public String getCourseInfo(){
		Map<String,String> parameter = new HashMap<String ,String>();
		if(major != null && "".equals(major)){
			parameter.put("major", major);
		}
		if(stage != null && "".equals(stage)){
			parameter.put("stage", stage);
		}
		QuestionAllList = qbsi.getCourseInfo(parameter);
		if(QuestionAllList != null){
			return "QuestionAllList";
		}else{
			return "QuestionAllListFaile";
		}	
	}
	
	
	public String getWrittenQuestion(){
		System.out.println("传递参数"+pageIndex+"\t"+course.getCsId());
		pagebean = qbsi.getWrittenQuestion(pagebean, course, pageIndex);
		System.out.println("数据大小:"+pagebean.getList().size());
		System.out.println(course.getCsName()+"\t"+course.getCsId());
		return "WrittenQuestionList";
	}
	public String addWrittenQuestion(){
		//设置课程试题的关联
		//要设置外键关联
		written.setCsId(course.getCsId());
		written.setCourse(course);
		System.out.println("添加笔试题,其课程ID:"+written.getCsId());
		 qbsi.addWritten(written);
		return "addWrittenQuestion";
	}
	public String inportWrittenQuestions() throws FileNotFoundException{
		if(questionfile != null){
			//1,上传到服务器（struts2）(1,jsp表单提交控件、2，action)
			FileInputStream fis = new FileInputStream(questionfile);
			//2,读取excel文件中的数据,获取试题对象集合（POI:1,导包、2，读取数据流获取数据集合）
			listWQuestions = PoireadExcel.readExcel(fis, course);
			//3,批量添加到数据库(hibernate)
			qbsi.inportWrittenQuestions(listWQuestions);
		}else{
			//上传文件失败的判断，暂时不做
		}	
		return "inportWrittenQuestions";
	}
	
	public String getWrittenQuestionById(){
		written = qbsi.getWrittenQuestionById(WrittenTest.class, written.getQid());
		return "getWrittenQuestionById";
	}
	public String updateWrittenQuestion(){
		//关联课程对象，笔试题-->课程  == n-->1
		written.setCsId(course.getCsId());
		written.setCourse(course);
		qbsi.updateWrittenQuestion(written);
		System.out.println("正在更新");
		return "updateWrittenQuestion";
	}
	
	
	
	
	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * @return the stage
	 */
	public String getStage() {
		return stage;
	}

	/**
	 * @param stage the stage to set
	 */
	public void setStage(String stage) {
		this.stage = stage;
	}

	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	/**
	 * @return the machine
	 */
	public MachineTest getMachine() {
		return machine;
	}


	/**
	 * @param machine the machine to set
	 */
	public void setMachine(MachineTest machine) {
		this.machine = machine;
	}


	/**
	 * @return the written
	 */
	public WrittenTest getWritten() {
		return written;
	}


	/**
	 * @param written the written to set
	 */
	public void setWritten(WrittenTest written) {
		this.written = written;
	}

	public PageBean<WrittenTest> getPagebean() {
		return pagebean;
	}

	public void setPagebean(PageBean<WrittenTest> pagebean) {
		this.pagebean = pagebean;
	}


	/**
	 * @return the questionAllList
	 */
	public List<Object> getQuestionAllList() {
		return QuestionAllList;
	}

	/**
	 * @param questionAllList the questionAllList to set
	 */
	public void setQuestionAllList(List<Object> questionAllList) {
		QuestionAllList = questionAllList;
	}


	/**
	 * @return the listWQuestions
	 */
	public List<WrittenTest> getListWQuestions() {
		return listWQuestions;
	}


	/**
	 * @param listWQuestions the listWQuestions to set
	 */
	public void setListWQuestions(List<WrittenTest> listWQuestions) {
		this.listWQuestions = listWQuestions;
	}


	/**
	 * @return the questionfile
	 */
	public File getQuestionfile() {
		return questionfile;
	}


	/**
	 * @param questionfile the questionfile to set
	 */
	public void setQuestionfile(File questionfile) {
		this.questionfile = questionfile;
	}


	/**
	 * @return the pageIndex
	 */
	public int getPageIndex() {
		return pageIndex;
	}


	/**
	 * @param pageIndex the pageIndex to set
	 */
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
}
