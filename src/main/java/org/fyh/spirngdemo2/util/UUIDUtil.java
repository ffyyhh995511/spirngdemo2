package org.fyh.spirngdemo2.util;

import java.util.UUID;

public class UUIDUtil {
	public static String getUUID(){
		return UUID.randomUUID().toString().replace("-", "");
	}
}
