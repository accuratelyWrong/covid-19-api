package com.ah.covid19.api.restservice;

import com.ah.covid19.api.model.Case;
import com.ah.covid19.api.model.Location;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Covid19Controller {
    private static final Logger logger = LoggerFactory.getLogger(Covid19Controller.class);

    @Value("classpath:data/covid19.json")
    private Resource resourceFile;

    private JSONObject data;

    private Map<Location, List<Case>> confirmedCase = new HashMap<>();

    @PostConstruct
    public void init() throws IOException {
        logger.info("Initializing...");
        resourceFile.getInputStream();
        data = new JSONObject(FileUtils.readFileToString(resourceFile.getFile(),"UTF-8"));

        JSONObject confirmed = data.getJSONObject("confirmed");
    }

    @GetMapping("/hello")
    public String helloworld() {
        return "Hello World";
    }

    @GetMapping("/confirmed")
    public String confirmed() {
        return data.get("confirmed").toString();
    }
}
