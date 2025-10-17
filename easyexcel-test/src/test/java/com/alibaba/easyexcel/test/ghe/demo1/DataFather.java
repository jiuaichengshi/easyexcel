package com.alibaba.easyexcel.test.ghe.demo1;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class DataFather {
  @ExcelProperty("名称")
  public String name;
}
