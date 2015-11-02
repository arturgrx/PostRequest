package ru.art.postrequest;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.art.postrequest.dao.CountryRepository;
import ru.art.postrequest.entities.Country;
import ru.art.postrequest.services.CountryService;
import ru.art.postrequest.utils.Request;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Request request = context.getBean("testRequest", Request.class);
        CountryService countryService = context.getBean(CountryService.class);
        countryService.sendRequest(request);



    }
}
