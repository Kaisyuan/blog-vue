package com.kaisyuan.blog.Admin.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author
 */
@Data
public class TagsResponseDto implements Serializable {

    private Integer tagId;

    private String tagName;
}
