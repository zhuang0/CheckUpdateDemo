package com.tutor.update;

import android.app.Activity;
import android.os.Bundle;

public class MainAcitivity extends Activity {
    

	private UpdateManager mUpdateManager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //这里来检测版本是否需要更新
        mUpdateManager = new UpdateManager(this);
        mUpdateManager.checkUpdateInfo();
    }     
}