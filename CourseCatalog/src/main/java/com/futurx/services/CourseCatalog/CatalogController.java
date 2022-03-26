package com.futurx.services.CourseCatalog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CatalogController {

    @RequestMapping("/")
    public String getCatalogHome() {
        String courseAppMesage = "";
        String courseAppURL = "http://localhost:9001/";
        RestTemplate restTemplate = new RestTemplate();
        courseAppMesage = restTemplate.getForObject(courseAppURL,String.class);

        return("Welcome to Catalog "+courseAppMesage);
    }

    @RequestMapping("/catalog")
    public String getCatalog() {
        String courses = "";
        String courseAppURL = "http://localhost:9001/courses";
        RestTemplate restTemplate = new RestTemplate();
        courses = restTemplate.getForObject(courseAppURL,String.class);

        return("We offer the following courses \n "+courses);
    }

    @RequestMapping("/firstcourse")
    public String getSpecificCourse() {
        Course course = new Course();
        String courseAppURL = "http://localhost:9001/1";
        RestTemplate restTemplate = new RestTemplate();
        course = restTemplate.getForObject(courseAppURL,Course.class);

        return("Our first course is: \n"+course.getCoursename());
    }

}
