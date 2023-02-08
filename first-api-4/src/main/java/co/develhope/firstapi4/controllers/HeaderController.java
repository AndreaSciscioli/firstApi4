package co.develhope.firstapi4.controllers;

import jdk.jfr.MemoryAddress;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/headers")
public class HeaderController {
    @RequestMapping
    public String getHeaders(@RequestHeader("host") String s1){
        String[] hostAndPort = s1.split(":");
        return "running on " + hostAndPort[0] + " in " + hostAndPort[1] + " port";
        //return "running on " + s1 + " host";



    }

}
