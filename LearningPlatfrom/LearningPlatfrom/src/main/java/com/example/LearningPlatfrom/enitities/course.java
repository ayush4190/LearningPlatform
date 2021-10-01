package com.example.LearningPlatfrom.enitities;

public class course {

    private Integer courseId;
    private String courseName;
    private String tag;

    public course(){

    }

    public course(Integer id , String courseName , String tag){
        this.courseId = id;
        this.courseName = courseName;
        this.tag = tag;

    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }


    @Override
    public String toString()
    {

        return "Course [id="
                + courseId + ", Coursename="
                + courseName + ", tag="
                + tag + "]";


    }
}
