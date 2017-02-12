package com.ifreedomer.simpleclean;

import java.util.List;

/**
 * @author:eavawu
 * @date: 12/02/2017.
 * @todo:
 */

public class GlobalDataManager {
    private List<String> whiteList;

    public List<String> getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(List<String> whiteList) {
        this.whiteList = whiteList;
    }

    private GlobalDataManager() {
    }

    private static GlobalDataManager globalDataManager = new GlobalDataManager();

    public static GlobalDataManager getInstance() {
        return globalDataManager;
    }

}
