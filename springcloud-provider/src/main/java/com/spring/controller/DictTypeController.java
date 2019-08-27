package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.spring.pojo.DictType;
import com.spring.service.DictTypeService;
/**
 * 
 * @author jm
 *
 */
@RequestMapping("/dept")
@RestController
public class DictTypeController {
	@Autowired
	private DictTypeService dictTypeService;
	@RequestMapping("/add")
	public DictType addDept(@RequestParam("type")String type) {
		return dictTypeService.dictTypeSelect(type);
	}
}
