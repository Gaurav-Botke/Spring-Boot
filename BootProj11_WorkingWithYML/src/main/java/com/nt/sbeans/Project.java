package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="proj.info")
public class Project {
          private Integer pid;
          private String pname;
          private String plocation;
          private Integer psize;
          
          
}
