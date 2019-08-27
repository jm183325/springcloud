package com.spring.dao;


import java.util.List;

import com.spring.pojo.DictType;

public interface DictTypeDao {
	public DictType dictTypeSelect(String type);
	public List<DictType> dictTypeSelectAll();
	
}
