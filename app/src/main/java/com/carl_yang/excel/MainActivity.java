package com.carl_yang.excel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.carl_yang.domain.User;
import com.carl_yang.excellib.ExcelUtils;
import com.carl_yang.excellib.JsonHelper;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import jxl.format.Colour;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void onViewClicked() {

        String jsonDatas = "{\"userName\":\"小明\"}";
        new JsonHelper<User>() {
            @Override
            public void success(User us) {
                System.out.println("------------"+us.getUserName());
            }
        }.doBus(jsonDatas);

        List<User> content_list_user=new ArrayList<>();
        User us=new User();
        us.setUserName("aaaa");
        User us1=new User();
        us1.setUserName("aaaa1111");
        us1.setDoubletest(22.22);
        us1.setLongtest(12333);
        us1.setUserid(11);
        us1.setMboolean(true);
        content_list_user.add(us);
        content_list_user.add(us1);


        ExcelUtils.getInstance()
                .setSHEET_NAME("测试Sheet")//设置表格名称
                .setFONT_COLOR(Colour.BLUE)//设置标题字体颜色
                .setFONT_TIMES(8)//设置标题字体大小
                .setFONT_BOLD(true)//设置标题字体是否斜体
                .setBACKGROND_COLOR(Colour.GRAY_25)//设置标题背景颜色
                .setContent_list_Strings(content_list_user)//设置excel内容
                .createExcel(MainActivity.this);
    }
}
