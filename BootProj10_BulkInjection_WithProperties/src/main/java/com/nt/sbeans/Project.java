package com.nt.sbeans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Project {
             private Integer id;
             private String name;
             private Integer size;
             private  String location;
}