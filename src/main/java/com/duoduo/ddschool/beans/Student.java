package com.duoduo.ddschool.beans;

import lombok.*;

/**
 * 学生类，此类包含了学生包含的各种信息
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;

    /** 学生的性别，其中0代表女孩，1代表男孩 */
    private int sex;

    /** 学生的班级，因为和jvm预留关键字一直，故命名为klass */
    private Klass klass;

    private int age;

    /** 学生的备注 */
    private String note;
}
