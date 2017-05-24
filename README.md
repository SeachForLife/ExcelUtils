# ExcelUtils
Excel快速生成库</br>

# Android Studio 引用库
![image](https://github.com/SeachForLife/ExcelUtils/Pictures/lib.PNG )</br>


# 示例
ExcelUtils.getInstance()</br>
                .setSHEET_NAME("测试Sheet")//设置表格名称 </br>
                .setFONT_COLOR(Colour.BLUE)//设置标题字体颜色 </br>
                .setFONT_TIMES(8)//设置标题字体大小 </br>
                .setFONT_BOLD(true)//设置标题字体是否斜体 </br>
                .setBACKGROND_COLOR(Colour.GRAY_25)//设置标题背景颜色</br>
                .setContent_list_Strings(content_list_user)//设置excel内容</br>
                .createExcel(MainActivity.this);</br>

