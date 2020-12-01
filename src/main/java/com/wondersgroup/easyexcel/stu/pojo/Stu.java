package com.wondersgroup.easyexcel.stu.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;

@ApiModel(value = "测试实例",description = "测试实例")
public class Stu {
    @Id
    @ApiModelProperty(value = "ID",name = "ID")
    private Integer id;

    @ApiModelProperty(value = "名字",name = "名字")
    private String name;

    @ApiModelProperty(value ="年龄",name = "年龄")
    private Integer age;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}