package com.michael.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.michael.pojo.Notice;
import com.michael.service.NoticeService;

@Controller
public class NoticeController {
	@Resource
	private NoticeService noticeService;

	@GetMapping("/findAll")
	@ResponseBody
	public List<Notice> findAll() {
		List<Notice> list = noticeService.findAll();
		return list;
	}

	@GetMapping("/show")
	public String show() {
		return "html/notice.html";
	}

	@PostMapping("/findByPage")
	@ResponseBody
	public Map<String, Object> findByPage(@Param("pagee") Integer page,
			@Param("rows") Integer rows) {
		Map<String, Object> map = noticeService.findByPage(page, rows);
		return map;
	}
}
