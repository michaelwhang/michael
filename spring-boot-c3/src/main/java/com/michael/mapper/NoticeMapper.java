package com.michael.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.michael.pojo.Notice;

@Mapper
public interface NoticeMapper {
	public List<Notice> findAll();

	public Long findTotal();

	public List<Notice> findByPage(int page, Integer rows);
}
