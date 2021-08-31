package org.peut.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BaseController {

    @GetMapping(value="/")
    public String sayHello() {
        return "Hello world!";
    }

   @GetMapping("naam/{naam}")
   //@ResponseBody
    public String getNaam(@PathVariable String naam) {
        return "Hallo " + naam;
    }

    //@GetMapping("/json")
    //@ResponseBody. Apparently default with a RESTController
    @RequestMapping(value="/json", method = RequestMethod.GET, produces="application/json")
        public Map<String, String> sayHello22() {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Koen");
        map.put("intelligence", "Infinite");
        map.put("googleSkills", "Expert");
        return map;
    }


}
