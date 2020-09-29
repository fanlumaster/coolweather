package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city") // 对象转Json或者Json转对象，字段名称会被替换成注解的名字。即让JSON字段和Java字段之间建立映射关系
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
