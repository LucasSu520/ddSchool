package com.duoduo.ddschool.beans;

import lombok.*;

/** 老师类 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private String name;

    private int age;

    /** 老师毕业学校 */
    private String schoolName;

    /** 老师性别，0代表女生，1代表男生 */
    private int sex;

    /** 老师教学年龄 */
    private int teachAge;
}
