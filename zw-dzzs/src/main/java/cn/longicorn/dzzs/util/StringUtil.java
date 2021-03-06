package cn.longicorn.dzzs.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by asus on 2017/10/22.
 */
public class StringUtil {

    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static String[] splitString(String str, String regex) {
        if (str != null) {
            str.trim();
        }
        return str.split(regex);
    }
}
