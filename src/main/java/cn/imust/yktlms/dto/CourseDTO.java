package cn.imust.yktlms.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author SERENDIPITY
 */
public class CourseDTO {

    /**
     * 课程号
     */
    private String courseId;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 授课教师工号
     */
    private String teacherName;

    /**
     * 课程时间
     */
    private Integer courseTime;

    /**
     * 上课地点
     */
    private String courseLocal;

    /**
     * 课程周数
     */
    private Integer courseWeek;

    /**
     * 课程类型
     */
    private String courseType;

    /**
     * 课程学分
     */
    private Integer courseSore;

    /**
     * 状态(0,不可用;1可用)
     */
    private Integer courseStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    public CourseDTO(String courseId, String courseName, String teacherName, Integer courseTime, String courseLocal, Integer courseWeek, String courseType, Integer courseSore, Integer courseStatus, Date createTime, Date updateTime) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.courseTime = courseTime;
        this.courseLocal = courseLocal;
        this.courseWeek = courseWeek;
        this.courseType = courseType;
        this.courseSore = courseSore;
        this.courseStatus = courseStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public CourseDTO() {

    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Integer courseTime) {
        this.courseTime = courseTime;
    }

    public String getCourseLocal() {
        return courseLocal;
    }

    public void setCourseLocal(String courseLocal) {
        this.courseLocal = courseLocal;
    }

    public Integer getCourseWeek() {
        return courseWeek;
    }

    public void setCourseWeek(Integer courseWeek) {
        this.courseWeek = courseWeek;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public Integer getCourseSore() {
        return courseSore;
    }

    public void setCourseSore(Integer courseSore) {
        this.courseSore = courseSore;
    }

    public Integer getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(Integer courseStatus) {
        this.courseStatus = courseStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
