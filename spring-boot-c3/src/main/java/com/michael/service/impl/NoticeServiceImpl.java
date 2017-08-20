package com.michael.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.michael.mapper.NoticeMapper;
import com.michael.pojo.Notice;
import com.michael.service.NoticeService;

@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {
	// 注入
	@Resource
	private NoticeMapper noticeMapper;

	@Override
	public List<Notice> findAll() {
		List<Notice> list = noticeMapper.findAll();
		return list;
	}

	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		// 获得总数
		Long total = noticeMapper.findTotal();
		// 获得页面数据
		List<Notice> list = noticeMapper.findByPage((page - 1) * rows, rows);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}

}
