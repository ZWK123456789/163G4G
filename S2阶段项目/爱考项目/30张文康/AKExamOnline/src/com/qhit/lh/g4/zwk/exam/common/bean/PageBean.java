/**
 * 
 */
package com.qhit.lh.g4.zwk.exam.common.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张文康
 *2018年1月5日下午5:06:04
 * TODO
 */
public class PageBean<T> {

	private int totalCount;
	private int pageSize;
	private int pageNum;
	private List<T> list;
	private int pageIndex;
	private int prePage;
	private int nextPage;
	
	/**
	 * @return the prePage
	 */
	public int getPrePage() {
		if(this.pageIndex <= 1){
			this.pageIndex = 1;
		}else{
			this.prePage = this.pageIndex - 1;
		}
		return prePage;
	}
	/**
	 * @param prePage the prePage to set
	 */
	public void setPrePage(int prePage) {
		if(this.pageIndex <= 1){
			this.pageIndex = 1;
		}else{
			this.prePage = this.pageIndex - 1;
		}
	}
	/**
	 * @return the nextPage
	 */
	public int getNextPage() {
		if(this.pageIndex >= this.pageNum){
			//this.pageIndex = this.totalCount;
			this.nextPage = this.pageNum;
		}else{
			this.nextPage = this.pageIndex + 1;
		}
		return nextPage;
	}
	/**
	 * @param nextPage the nextPage to set
	 */
	public void setNextPage(int nextPage) {
		if(this.pageIndex >= this.pageNum){
			//this.pageIndex = this.totalCount;
			this.nextPage = this.pageNum;
		}else{
			this.nextPage = this.pageIndex + 1;
		}
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		pageNum = (int) Math.ceil(totalCount*1.0/pageSize);
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public void setPageIndex(int pageIndex) {
		//设置之前先进行判断
		if(pageIndex < 1){
			pageIndex = 1;
		}else if(pageIndex > pageNum){
			pageIndex = pageNum;
		}else{
			this.pageIndex = pageIndex;
		}
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public PageBean() {
		super();
		// TODO Auto-generated constructor stub
		pageIndex = 1;
		pageSize = 5;
		list = new ArrayList<T>();
	}
	public PageBean(int totalCount, int pageSize, int pageNum, int pageIndex) {
		super();
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.pageNum = pageNum;
		this.pageIndex = pageIndex;
	}
	public PageBean(int totalCount, int pageSize, int pageNum, List<T> list,
			int pageIndex) {
		super();
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.pageNum = pageNum;
		this.list = list;
		this.pageIndex = pageIndex;
	}

	
/*	public void addList(Object obj){
		list.add(obj);
	}*/
	
}
