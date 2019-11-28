package com.company.util;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

public class SSOFileUpload {

	@Value("${fileuploadpath}")
	private String path;

	public String upload(HttpServletRequest request, HttpSession session) {
		// 图片地址
		String fileName = null;
		// 将当前上下文初始化给CommonsMultipartResolver（多部分解析器）
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(session.getServletContext());
		// 检查form中是否有enctype="multipart/from-data"
		if (multipartResolver.isMultipart(request)) {
			// 将request变成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 获取request中所有的文件名
			Iterator<String> iter = multiRequest.getFileNames();
			while (iter.hasNext()) {
				MultipartFile file = multiRequest.getFile(iter.next().toString());
				if (file != null) {
					fileName = file.getOriginalFilename();
					String path = getPath() + fileName;
					try {
						file.transferTo(new File(path));
					} catch (IllegalStateException | IOException e) {
						e.printStackTrace();
					}

				}
			}
		}
		return fileName;

	}

	public String getPath() {

		return path;
	}

	public void setPath(String path) {

		this.path = path;
	}
}
