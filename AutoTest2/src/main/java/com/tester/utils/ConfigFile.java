package com.tester.utils;

import com.tester.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigFile {

	//ResourceBundle 读取属性文件
   private static ResourceBundle bundle= ResourceBundle.getBundle("application", Locale.CHINA);;

   	//获取URL
    public static String getUrl(InterfaceName name){
        String address = bundle.getString("test.url");   //test.url=http://localhost:8888
        String uri = "";
        String testUrl;
        
        //判断传进来的name,根据name从application中获取对应的 接口
        if(name == InterfaceName.GETUSERLIST){
            uri = bundle.getString("getUserList.uri");

        }

        if(name == InterfaceName.LOGIN){
            uri = bundle.getString("login.uri");
        }

        if(name == InterfaceName.UPDATEUSERINFO){
            uri = bundle.getString("updateUserInfo.uri");
        }

        if(name == InterfaceName.GETUSERINFO){
            uri = bundle.getString("getUserInfo.uri");
        }

        if(name == InterfaceName.ADDUSERINFO){
            uri = bundle.getString("addUser.uri");
        }
        testUrl = address + uri;  //url拼接
        return testUrl;  //返回总url
    }
}
