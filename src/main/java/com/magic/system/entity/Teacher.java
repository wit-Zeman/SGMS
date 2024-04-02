package com.magic.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 教师信息表
 * </p>
 *
 * @author magic
 * @since 2024-04-02
 */
@TableName("t_teacher")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 教师id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 教师姓名
     */
    private String name;

    /**
     * 性别：1-男，2-女，3-未知
     */
    private Byte gender;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 出生日期
     */
    private LocalDate birth;

    /**
     * 联系方式
     */
    private String contact;

    /**
     * 住址
     */
    private String address;

    /**
     * 学历
     */
    private String education;

    /**
     * 专业
     */
    private String major;

    /**
     * 入职日期
     */
    private LocalDate entryDate;

    /**
     * 离职日期
     */
    private LocalDate dimissionDate;

    /**
     * 所属学院
     */
    private String department;

    /**
     * 管理班级id
     */
    private Long classId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

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

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDate getDimissionDate() {
        return dimissionDate;
    }

    public void setDimissionDate(LocalDate dimissionDate) {
        this.dimissionDate = dimissionDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Teacher{" +
            "id = " + id +
            ", name = " + name +
            ", gender = " + gender +
            ", age = " + age +
            ", birth = " + birth +
            ", contact = " + contact +
            ", address = " + address +
            ", education = " + education +
            ", major = " + major +
            ", entryDate = " + entryDate +
            ", dimissionDate = " + dimissionDate +
            ", department = " + department +
            ", classId = " + classId +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
        "}";
    }
}
