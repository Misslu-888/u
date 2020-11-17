package org.lwj.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lwj
 * @since 2020-11-16
 */
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @TableField("mid")
    private Long mid;

    @TableField("sex")
    private Integer sex;

    @TableField("age")
    private Integer age;

    @TableField("bitthday")
    @JsonFormat(pattern = "yyyy-MM-ss",timezone = "GMT+8")
    private Date bitthday;

    @TableField(exist = false)
    private String mname;

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public Date getBitthday() {
        return bitthday;
    }

    public void setBitthday(Date bitthday) {
        this.bitthday = bitthday;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", name=" + name +
            ", mid=" + mid +
            ", sex=" + sex +
            ", age=" + age +
            ", bitthday=" + bitthday +
        "}";
    }
}
