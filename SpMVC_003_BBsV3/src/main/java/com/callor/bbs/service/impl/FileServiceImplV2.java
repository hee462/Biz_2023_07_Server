package com.callor.bbs.service.impl;

import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.callor.bbs.config.QualifierConfig;

import lombok.extern.slf4j.Slf4j;

@Service(QualifierConfig.SERVICE.FILE_V2)
@Slf4j
public class FileServiceImplV2 extends FileServiceImplV1 {
	/*
	 * V1클래스에는 fileUp(), filesUp() ,delete() method가 있다 이 method들을 기본적으로 상속받아서 사용하겠다
	 *
	 * V1클래스에 protected 선언된 2개의 변수(객체)를 여기에서 상속받아서 사용하겠다
	 *
	 * 클래스를 상속받을때 V1 클래스의 생성자는 상속받지 않는다
	 *
	 *
	 */
	// fileup-context.xml 에 선언된 2개의 String bean 값을 사용할수 있도록 주입해 달라
//	protected final String windowsPath;
//	protected final String winPath;
//	protected final String macHome;
//	protected final String macPath;
//
//	public FileServiceImplV2(ResourceLoader resource,
//			String windowsPath, String winPath,
//			String macPath,String macHome) {
//		/*
//		 * super() 상속받은 클래스의 생성자에게 무언가 전달할때 사용하는 method 일종의 전달자 V1 클래스의 생성자에게 resource
//		 * 객체를 전달하여 final로 선언된 2의 변수(객체)를 초기화 해달라고 요청
//		 *
//		 */
//		super(resource);
//		this.windowsPath = windowsPath;
//		this.winPath = winPath;
//		this.macPath = macPath;
//		this.macHome = macHome;
//	}

	public FileServiceImplV2(ResourceLoader resource) {
		super(resource);
		// TODO Auto-generated constructor stub
	}

	/*
	 * V1.fileUp() method를 다시 정의 하겠다.
	 */
	@Override
	public String fileUp(MultipartFile file) throws Exception {

//		log.debug("winPath : {}", winPath);
//		log.debug("macPath : {}", macPath);
//
//		String fileUppath = macHome +macPath;
//		File path = new File(windowsPath);
//		if(path.exists()) {
//			fileUppath = winPath;
//		}
//		log.debug("Up folder {}" ,fileUppath);
//		// 만약 System에 Upload할 path가 없으면 생성하라
//		path = new File(fileUppath);
//		if (!path.exists()) {
//			path.mkdirs();
//		}
//
//		String fileName = file.getOriginalFilename();
//		File upLoadFile = new File(fileUppath, fileName);
//		file.transferTo(upLoadFile);
//		return fileName;

		return null;
	}

}
