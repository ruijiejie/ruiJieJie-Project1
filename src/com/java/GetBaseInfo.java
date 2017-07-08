package com.java;
import com.java.BaseInfo;
/**
 * Created by erui on 2017/7/7.
 */
public class GetBaseInfo implements BaseInfo {

    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public String getNo(String no) {
        return no;
    }

    @Override
    public String getTel(String tel) {
        return tel;
    }
}
