package com.alibaba.easyexcel.test.ghe.demo1;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson2.JSON;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Invoke {

  public static void main(String[] args) {
    String fileName = "/Users/heguangqing/D/部署文档/武器系统导入模版20250308.xls";
    List<BomTable> list = new ArrayList<>();
    EasyExcel.read(fileName, BomTable.class, new AnalysisEventListener<BomTable>() {

      @Override
      public void invoke(BomTable data, AnalysisContext context) {
        list.add(data);

      }

      @Override
      public void doAfterAllAnalysed(AnalysisContext context) {
        System.out.println("保存完毕！");
      }
    }).sheet().doRead();
    list.forEach(
        bomTable -> {
          String partName =
              Stream.of(
                      bomTable.getLevel1(),
                      bomTable.getLevel2(),
                      bomTable.getLevel3(),
                      bomTable.getLevel4(),
                      bomTable.getLevel5(),
                      bomTable.getLevel6(),
                      bomTable.getLevel7())
                  .filter(level -> level != null && !level.trim().isEmpty())
                  .findFirst()
                  .orElseThrow(
                      () ->
                          new RuntimeException(
                              "Level1到Level7都为空，无法设置part_number，当前记录：" + bomTable.toString()));

          bomTable.setPart_name(partName);
        });
    System.out.println(JSON.toJSONString(list));
  }
}
