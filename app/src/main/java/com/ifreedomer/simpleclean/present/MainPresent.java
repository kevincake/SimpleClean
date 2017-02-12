package com.ifreedomer.simpleclean.present;

import android.text.TextUtils;
import android.util.Log;

import com.ifreedomer.simpleclean.GlobalDataManager;
import com.ifreedomer.simpleclean.SimleCleanApplication;
import com.ifreedomer.simpleclean.constants.FileConstants;
import com.ifreedomer.simpleclean.utils.FileUtils;
import com.ifreedomer.simpleclean.utils.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/**
 * @author:eavawu
 * @date: 11/02/2017.
 * @todo:
 */

public class MainPresent {
    private static final String TAG = MainPresent.class.getSimpleName();

    public void initLogic() {

    }

    public void copyDB2CacheDir() {
        File file = new File(FileConstants.SIMPLE_CLEAN_CACHE);
        if (!file.exists()) {
            file.mkdirs();
        }
        FileUtils.copyAssetFile2Dir(SimleCleanApplication.getInstance(), FileConstants.APP_CACHE_DB, FileConstants.SIMPLE_CLEAN_CACHE);
        FileUtils.copyAssetFile2Dir(SimleCleanApplication.getInstance(), FileConstants.APP_FOLDER, FileConstants.SIMPLE_CLEAN_CACHE);
    }


    public void initWhiteList() {
        try {
            InputStream ins = SimleCleanApplication.getInstance().getAssets().open(FileConstants.WHITE_LIST);
            String whiteListStr = IOUtils.convertStreamToString(ins);
            if (TextUtils.isEmpty(whiteListStr)) {
                Log.d(TAG, "initWhiteList failed");
                return;
            }
            String[] whiteArr = whiteListStr.split("\\|");
            List<String> whiteList = Arrays.asList(whiteArr);
            GlobalDataManager.getInstance().setWhiteList(whiteList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getADCache() {

    }


}
