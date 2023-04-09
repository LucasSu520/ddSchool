package com.duoduo.ddschool.beans;

import lombok.*;

/**
 * 班级类
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Klass {
    private String name;

    private String number;

    /** 班级宣言 */
    private String note;

    /** 每个班级对应一个老师 */
    private Teacher teacher;

    /** 班级对应的等级 1代表课改班，2代表火箭班，3代表奥赛班,成绩排序 1>2>3; */
    private int rank;
}
