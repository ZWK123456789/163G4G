package com.qhit.lh.g4.ZWK.SBM.utils;

import java.util.UUID;

public class IDUtil {

	
	//使用UUID
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
