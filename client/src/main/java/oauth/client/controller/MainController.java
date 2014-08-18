package oauth.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import oauth.client.config.WochitOauth;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @WochitOauth
    @RequestMapping(value="/cats")
    @ResponseBody
    public String getCats() {
        return "Private cats";
    }


    @RequestMapping(value="/publicCats")
    public @ResponseBody List<String> getPublicCats() {
        List<String> cats = new ArrayList<String>();
        cats.add("Public cats");
        cats.add("Public cats2");
        return cats;
    }

}
