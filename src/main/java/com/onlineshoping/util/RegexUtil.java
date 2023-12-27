package com.onlineshoping.util;

import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Component;

@Component
public class RegexUtil {

    private static boolean mismatch(String str, String regex){
        if (StrUtil.isBlank(str)) {
            return true;
        }
        return !str.matches(regex);
    }
    public static boolean isPhoneInvalid(String phone){
        return mismatch(phone, RegexPatterns.PHONE_REGEX);
    }
    public static boolean isPasswordInvalid(String password){
        return false;
    }
    static class RegexPatterns {
        public static final String PHONE_REGEX = "/^1(3\\d|4[5-9]|5[0-35-9]|6[2567]|7[0-8]|8\\d|9[0-35-9])\\d{8}$/";
    }
}
