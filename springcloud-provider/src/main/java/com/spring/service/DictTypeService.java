package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.dao.DictTypeDao;
import com.spring.pojo.DictType;
@Service
public class DictTypeService {
	@Autowired
	private DictTypeDao dictTypeDao;
	public DictType dictTypeSelect(String type) {
		return dictTypeDao.dictTypeSelect(type);
	}
	public List<DictType> dictTypeSelectAll() {
		// TODO Auto-generated method stub
		return dictTypeDao.dictTypeSelectAll();
	}

}
