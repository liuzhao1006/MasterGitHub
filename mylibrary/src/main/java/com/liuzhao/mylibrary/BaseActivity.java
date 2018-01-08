package com.liuzhao.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by liuchao on 2018/1/8.
 */

public class BaseActivity extends AppCompatActivity {

    protected void showToast(){
        Toast.makeText(this,"我是老爹",Toast.LENGTH_SHORT).show();
    }
}
