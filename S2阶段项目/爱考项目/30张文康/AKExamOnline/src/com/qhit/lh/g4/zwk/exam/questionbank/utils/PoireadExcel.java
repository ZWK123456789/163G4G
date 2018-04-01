/**
 * 
 */
package com.qhit.lh.g4.zwk.exam.questionbank.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.qhit.lh.g4.zwk.exam.questionbank.bean.WrittenTest;
import com.qhit.lh.g4.zwk.exam.subjectmana.bean.Course;

/**
 * @author ZWK
 *2018年1月9日下午3:55:25
 *TODO
 */
public class PoireadExcel {

	@SuppressWarnings("resource")
	public static List<WrittenTest> readExcel(InputStream is ,Course course){
		//创建工作簿
		Workbook workbook = null ;
		try {
			//把输入流导入工作簿（即读取流中的数据）
			workbook = new HSSFWorkbook(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			try {
				//把输入流导入工作簿（即读取流中的数据）
				workbook = new HSSFWorkbook(is);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		//读取工作簿中的第一个Excel表格
		Sheet sheet = workbook.getSheetAt(0);
		//第一行内容
		int firstIndex = 1;
		//获取表格的总行数
		int lastRowIndex = sheet.getPhysicalNumberOfRows();
		//创建一个集合用来装WrittenTest对象
		List<WrittenTest> listWritten = new ArrayList<WrittenTest>();
		for(int i = firstIndex ; i < lastRowIndex ;i++ ){
			Row row = sheet.getRow(i);
			WrittenTest question = new WrittenTest();
			//获取最后单元格索引
			//int firstCellIndex = 1;
			int lastCellIndex = row.getLastCellNum();
			if(row.getCell(0).getStringCellValue() == null && "".equals(row.getCell(0).getStringCellValue())){
				break;
			}
			
			for(int j = 0; j < lastCellIndex ; j++){
				Cell cell = row.getCell(j);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				switch (j) {
				case 0:
					question.setQtitle(cell.getStringCellValue());
					break;
				case 1:
					question.setOptionA(cell.getStringCellValue());
					break;
				case 2:
					question.setOptionB(cell.getStringCellValue());
					break;
				case 3:
					question.setOptionC(cell.getStringCellValue());
					break;
				case 4:
					question.setOptionD(cell.getStringCellValue());
					break;
				case 5:
					question.setAnswer(cell.getStringCellValue());
					break;
				case 6:
					question.setQtype(cell.getStringCellValue());
					break;
				case 7:
					question.setDegree(cell.getStringCellValue());
					break;
				case 8:
					question.setChapter(cell.getStringCellValue());
					break;
				}
			}
			//设置课程编号
			question.setCsId(course.getCsId());
			//添加试题和课程的关系
			question.setCourse(course);
			//把读取的试题对象保存到集合中
			listWritten.add(question);
			}
		return listWritten;
	}
}
