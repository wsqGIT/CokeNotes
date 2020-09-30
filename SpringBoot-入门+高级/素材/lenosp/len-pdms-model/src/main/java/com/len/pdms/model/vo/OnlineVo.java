package com.len.pdms.model.vo;

import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

/**
 * 需求实体
 */
@Data
public class OnlineVo implements Serializable {

    // 项目ID
    private String projectId;

    // 租户ID
    private String tenantId;

    // ID
    private String id;

    // 发布版本
    private String versionId;

    private String versionName;

    // 迭代
    private String iterationId;

    // 迭代
    private String iterationName;

    // 名称
    private String name;

    // 内容
    private String content;

    // 创建时间
    private Date createDate;

    // 创建时间
    private String createDateText;

}
