package com.alibaba.easyexcel.test.ghe.demo1;

import com.alibaba.excel.annotation.ExcelProperty;
import java.io.Serializable;
import lombok.Data;

@Data
public class BaseBomTable implements Serializable {

  /** 通用结构树 */
  private static final long serialVersionUID = 1L;

  private int id; // id
  // 项目库id
  private String projectLibraryId;
  private String part_name; // --部件名称
  private int bom_link_id; // 部件父子link
  private String model_name; // 型号名称
  private String model_code; // 型号代号

  @ExcelProperty("通用名称")
  private String common_name; // 通用名称

  @ExcelProperty("推荐图号")
  private String recommended_drawing_no; // 推荐图号

  @ExcelProperty("完整性分类")
  private String hierarchical_structure; // 层次结构

  @ExcelProperty("分类代字")
  private String classified_pronoun; // 分类代字

  @ExcelProperty("研制状态")
  private String development_status; // (50),--研制状态

  @ExcelProperty("零件类型")
  private String part_type; // 零件类型

  @ExcelProperty("设计序号")
  private String res1; // 分类号初始流水

  private String res2; // 型号系列代号
  private String updatetime; //

  @ExcelProperty("父类名称")
  private String parentName; // 父类名称

  private String typeCode; // 型式代号

  @ExcelProperty("备注1")
  private String des1; // 备注1

  @ExcelProperty("备注2")
  private String des2; // 备注2

  @ExcelProperty("结束日期")
  private String overTime; // 结束日期

  private String progress; // 进程
  private String checkPoint; // 检验点

  @ExcelProperty("产品从属")
  private String productDependency; // 产品从属

  @ExcelProperty("是否计量")
  private String has_measurement; // 是否计量 字典:是，否

  @ExcelProperty("是否固定产品代号")
  private String fixProductCode; // 是否固定产品代号 字典:是，否
}
