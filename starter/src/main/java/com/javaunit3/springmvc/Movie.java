package com.javaunit3.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public interface Movie {

    //add a public method to get the title
    public String getTitle();

    //add a public method to get the maturity rating
    public String getMaturityRating();

    //add a public method to get the genre
    public String getGenre();
}



