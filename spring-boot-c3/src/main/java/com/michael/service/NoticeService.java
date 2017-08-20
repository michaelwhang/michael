package com.michael.service;

import java.util.List;
import java.util.Map;

import com.michael.pojo.Notice;

public interface NoticeService {
	public List<Notice> findAll();

	public Map<String,Object> findByPage(Integer page, Integer rows);
}
