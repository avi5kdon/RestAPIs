package org.jboss.fuse.camel.rest;

import java.util.Map;
import java.util.TreeMap;

public class RestService {
private final Map<String,Subject> subjectMap = new TreeMap<>();

public RestService(){
    subjectMap.put("1",new Subject("Adam",22));
    subjectMap.put("2",new Subject("xyz",25));
    subjectMap.put("3",new Subject("abc",26));
}

public Subject get(String id){
    return subjectMap.get(id);
}



}
