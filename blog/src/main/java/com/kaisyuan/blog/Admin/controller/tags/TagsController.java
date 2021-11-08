package com.kaisyuan.blog.Admin.controller.tags;

import com.kaisyuan.blog.Admin.dto.TagsResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 */
@RestController
@RequestMapping(value = "admin/tags")
public class TagsController {

    @GetMapping(value = "getTagsList")
    public List<TagsResponseDto> getTagsList(){
        List<TagsResponseDto> response = new ArrayList<>();
        int i = 0;
        while (i < 5){
            i++;
            TagsResponseDto tagsResponseDto = new TagsResponseDto();
            tagsResponseDto.setTagId(i);
            tagsResponseDto.setTagName("test" + i);
            response.add(tagsResponseDto);
        }
        System.out.println(response.toString());
        return response;
    }
}
