package com.alibaba.easyexcel.test.ghe.demo1;

import com.alibaba.excel.annotation.ExcelProperty;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class BomTable extends BaseBomTable implements Serializable {


  /**
   * 新的实例的产品结构树
   */
  private static final long serialVersionUID = 1L;
  @ExcelProperty("Level1")
  private String Level1;
  @ExcelProperty("Level2")
  private String Level2;
  @ExcelProperty("Level3")
  private String Level3;
  @ExcelProperty("Level4")
  private String Level4;
  @ExcelProperty("Level5")
  private String Level5;
  @ExcelProperty("Level6")
  private String Level6;
  @ExcelProperty("Level7")
  private String Level7;
  private String part_number;//部件编号
  private String product_code;//产品代号
  private String model_character;//型号代字
  private String institute_management;//是否院管型号
  private int base_id;//依赖的BASE_BOM_TABLE的部件id
  private String res3;//res1 分类节点--备用2 型号系列代号   备用3  型号设计代号
  private String res4;//--备用4 型号改进序号
  private String product_category;//产品分类
  private String has_measurement;//是否计量 字典:是，否
  private String prefix;//前缀
  private String suffix;//后缀
  private Long parameterEnumId;// 编码参数表id
  @ExcelProperty("型式代号")
  private String typeCode; // 型式代号
  private String unit;//单位
  @ExcelProperty("是否型谱")
  private String has_typology;//是否型谱
  private String classified_pronoun_flow;//分类代字流水
  private String res5;//--备用4 型号改进序号
  private String bswydh;//标识唯一代号
  @ExcelProperty("区分号")
  private String qfh;//区分号
  private String rjtzbs;//软件特征标识
  private String rjdh;//软件代号 0 1  0为产品代号还没有要，1为产品代号要了
  @ExcelProperty("任务分工")
  private String taskFenGong;// 任务分工
  @ExcelProperty("PBS")
  private Boolean hasPbs; // 是否有pbs 0:否，1：是
  private String electromagneticCode;// 电磁代号
  private String structure_id;
  private String drwMode;
  private String drwModeName; // 图号所属型号
  private List<String> linkIds;//["id1 : G"，"id2 : G"，"id3 : J"]
}
