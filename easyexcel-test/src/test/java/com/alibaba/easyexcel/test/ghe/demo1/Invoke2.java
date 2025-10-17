package com.alibaba.easyexcel.test.ghe.demo1;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import com.alibaba.excel.util.ListUtils;
import java.util.Date;
import java.util.List;

public class Invoke2 {

  public static void main(String[] args) {

    EasyExcel.read("fileName", DemoData.class, new PageReadListener(dataList -> {

    })).sheet().doRead();
  }

  private static List<DemoData> data() {
    List<DemoData> list = ListUtils.newArrayList();
    for (int i = 0; i < 10; i++) {
      DemoData data = new DemoData();
      data.setString("字符串" + i);
      data.setDate(new Date());
      data.setDoubleData(0.56);
      list.add(data);
    }
    return list;
  }
}
