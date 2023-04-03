package com.sahilkadian.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {
//    URI versioning
    @GetMapping("/users/v1")
    public UserVersion1 userVersion1URI(){
        return new UserVersion1(1,"Sahil");
    }
//    URI versioning
    @GetMapping("/users/v2")
    public UserVersion2 userVersion2URI(){
        return new UserVersion2(1,"Sahil","Kadian","SDE1");
    }
//    Request Parameter versioning
    @GetMapping(path ="/users", params = "version=1")
    public UserVersion1 userVersion1Path(){
        return new UserVersion1(2,"Nitin");
    }
//    Request Parameter versioning
    @GetMapping(path ="/users", params = "version=2")
    public UserVersion2 userVersion2Path(){
        return new UserVersion2(2,"Nitin","Kumar","SDE2");
    }
//    Custom Header Versioning
    @GetMapping(path ="/users/header", headers = "X-API-VERSION=1")
    public UserVersion1 userVersion1Header(){
        return new UserVersion1(3,"Rajat");
    }
//    Custom Header Versioning
    @GetMapping(path ="/users/header", headers = "X-API-VERSION=2")
    public UserVersion2 userVersion2Header(){
        return new UserVersion2(3,"Rajat","Dash","SDE3");
    }
//    MimeType Versioning
    @GetMapping(path ="/users/accept", produces = "application/users-v1+json")
    public UserVersion1 userVersion1Media(){
        return new UserVersion1(4,"Shubham");
    }
//    MimeType Versioning
    @GetMapping(path ="/users/accept", produces = "application/users-v2+json")
    public UserVersion2 userVersion2Media(){
        return new UserVersion2(4,"Shubham","Gupta","ATL");
    }

}
