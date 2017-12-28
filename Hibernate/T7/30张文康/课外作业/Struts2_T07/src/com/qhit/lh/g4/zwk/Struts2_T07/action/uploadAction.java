/**
 * 
 */
package com.qhit.lh.g4.zwk.Struts2_T07.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.stream.FileImageInputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ZWK
 *2017年12月5日下午2:57:54
 *TODO上传文件的Action 组件
 */
public class uploadAction extends ActionSupport {

	//声明用户名变量
	private  String username;
	//文件上传控件的名字
	private  File uploadFiles;
	//Struts2框架中封装的上传文件的文件名与文件类型
	private String uploadFilesFileName;
	private String uploadFilesContentType;
	
	public String upload() {
		
		if(uploadFiles != null){
			try {
				//创建输入流，将上传文件写入流
				InputStream is = new FileInputStream(uploadFiles);
				//创建保存目录
				String savePath = ServletActionContext.getServletContext().getRealPath("/")+"upload";
				//System.out.println(savePath);
				File file = new File(savePath);
				//判断是否存在该目录
				if(!file.exists()){
					file.mkdirs();
				}
				//通过输出流将文件输出
				OutputStream os = new FileOutputStream(savePath+"/"+uploadFilesFileName);
				int len = 0;
				//创建缓存区
				byte buffer [] = new byte[8096];
				while((len = is.read(buffer)) != -1) {
					os.write(buffer, 0, len);
				}
				is.close();
				os.flush();
				os.close();
				return "upload";
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError("uploadFile", "文件未找到");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError("uploadFile", "文件未找到");
			}
		}else {
			super.addFieldError("uploadFile", "文件未找到");
			return "error";
		}
		return "upload";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public File getUploadFiles() {
		return uploadFiles;
	}

	public void setUploadFiles(File uploadFiles) {
		this.uploadFiles = uploadFiles;
	}

	public String getUploadFilesFileName() {
		return uploadFilesFileName;
	}

	public void setUploadFilesFileName(String uploadFilesFileName) {
		this.uploadFilesFileName = uploadFilesFileName;
	}

	public String getUploadFilesContentType() {
		return uploadFilesContentType;
	}

	public void setUploadFilesContentType(String uploadFilesContentType) {
		this.uploadFilesContentType = uploadFilesContentType;
	}


	}
	
	
