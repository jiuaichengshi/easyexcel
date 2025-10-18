package com.alibaba.easyexcel.test.ghe.demo2;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import com.alibaba.fastjson2.JSON;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

  /**
   * 最简单的读
   * <p>
   * 1. 创建excel对应的实体对象 参照{@link DemoData}
   * <p>
   * 2. 由于默认一行行的读取excel，所以需要创建excel一行一行的回调监听器，参照{@link DemoDataListener}
   * <p>
   * 3. 直接读即可
   */
  @org.junit.jupiter.api.Test
  public void simpleRead() {
//    String fileName = "/Users/heguangqing/IdeaProjects/easyexcel/easyexcel-test/src/test/resources/demo/demo.xlsx";
//    // 这里默认每次会读取100条数据 然后返回过来 直接调用使用数据就行
//    // 具体需要返回多少行可以在`PageReadListener`的构造函数设置
//    EasyExcel.read(fileName, DemoData.class, new PageReadListener<DemoData>(dataList -> {
//      for (DemoData demoData : dataList) {
//        log.info("读取到一条数据{}", JSON.toJSONString(demoData));
//      }
//    })).sheet().doRead();
    Map<String, List<String>> courseMap = new HashMap<>();
    courseMap.computeIfAbsent("数学", k -> new ArrayList<>()).add("小明");
    courseMap.computeIfAbsent("英语", k -> new ArrayList<>()).add("小红");
    courseMap.computeIfAbsent("数学", k -> new ArrayList<>()).add("小刚");
    System.out.println(courseMap);
  }
}
