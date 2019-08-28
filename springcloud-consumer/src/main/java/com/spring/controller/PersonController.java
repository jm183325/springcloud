package com.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.pojo.DictType;

@RestController

public class PersonController {
	@Autowired
	private  RestTemplate restTemplate;
	

	/*public static void main(String[] args) {
		Map<String,String> map = new HashMap();
        map.put("type","1");
        String url="http://springcloud-provider/dept/select";
		DictType dictType = restTemplate.getForObject(url,DictType.class);
        System.out.println(dictType);
	}*/
	@RequestMapping("/get")
	public void restTemplateGetTest(){
		
		String url="http://localhost:8083/dept/select";
		List<DictType> dictType = (List<DictType>) restTemplate.getForObject(url, List.class);
        System.out.println(dictType);
        System.out.println("@##");
    }
}
