	
# ExcelUtils
Excel快速生成库</br>

# Android Studio 引用库示例
### gradle中添加:
    第一步：
	    allprojects {
		    repositories {
			    ...
			    maven { url 'https://jitpack.io' }
		    }
	    }
    第二步:
 	    dependencies {
		    compile 'com.github.SeachForLife:ExcelUtils:0.1'
	    }


### 示例

	可以直接赋予一个对象进去
	List<User> content_list_user=new ArrayList<>();
	ExcelUtils.getInstance()
		.setSHEET_NAME("测试Sheet")//设置表格名称 
		.setFONT_COLOR(Colour.BLUE)//设置标题字体颜色 
		.setFONT_TIMES(8)//设置标题字体大小 
		.setFONT_BOLD(true)//设置标题字体是否斜体 
		.setBACKGROND_COLOR(Colour.GRAY_25)//设置标题背景颜色
		.setContent_list_Strings(content_list_user)//设置excel内容
		.createExcel(MainActivity.this)

