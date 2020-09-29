package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    // 温度
    public class Temperature {
        public String max;
        public String min;
    }

    // 更多信息
    public class More {
        @SerializedName("txt_d")
        public String info;
    }

}
