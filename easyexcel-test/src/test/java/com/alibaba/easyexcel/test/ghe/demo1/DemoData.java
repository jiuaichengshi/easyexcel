package com.alibaba.easyexcel.test.ghe.demo1;

import com.alibaba.excel.annotation.ExcelProperty;
import java.util.Date;
import lombok.Data;

@Data
public class DemoData extends DataFather{

  @ExcelProperty("字符串标题")
  private String string;
  @ExcelProperty("日期标题")
  private Date date;
  @ExcelProperty("数字标题")
  private Double doubleData;
}
