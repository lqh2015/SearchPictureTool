package com.searchpicturetool.model;

import com.searchpicturetool.utils.Utils;

/**
 * Created by liqinghai on 2016/12/6.
 */
public class APIStore {
    public static final String imgPath= Utils.getSDPath()+"/DownloadPicture";
    public static final String diskLrucacheCachePath= Utils.getSDPath()+"/SearchImgCache";
    //图片搜索接口
    public static final String baseUrl="http://pic.sogou.com";
    //笑话api
    public static final String LAIFU_JOY_IMAGE="http://api.laifudao.com/open/tupian.json";
    public class status{
        public static final int success=200;
        public static final int error=-1;
    }
}
