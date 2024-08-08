package com.smilecat.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.smilecat.entity.File;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//公益组织获取所有项目数据
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO3 {
    private String projectName;
    private String admin;//管理员userId
    private String mail;
    private String date;
    private String location;
    private int volunteers;
    private int signIns;
    private int totalDuration;
    private List<File> files;
    private int status;
    @JsonIgnore
    private String projectId;
    @JsonIgnore
    private String openId;//管理员id
}
