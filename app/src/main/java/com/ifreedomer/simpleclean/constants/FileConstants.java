package com.ifreedomer.simpleclean.constants;

import android.os.Environment;

import java.io.File;

/**
 * @author:eavawu
 * @date: 11/02/2017.
 * @todo:
 */

public class FileConstants {
    public static final String APP_CACHE_DB = "app_cache.db";
    public static final String APP_FOLDER = "app_folder.db";
    public static final String APP_AD = "app_ad.db";
    public static final String SIMPLE_CLEAN_CACHE = Environment.getExternalStorageDirectory() + File.separator + "SimpleClean";
    public static final String WHITE_LIST = "whitelist.txt";
}
