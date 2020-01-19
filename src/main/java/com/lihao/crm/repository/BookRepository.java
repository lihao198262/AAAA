package com.lihao.crm.repository;

import java.util.List;

import com.lihao.crm.entity.Book;
import com.lihao.crm.entity.Company;
import com.lihao.crm.entity.SysUser;

public interface BookRepository extends BaseRepository<Book, Long> {
	
	public List<Book> findAllByNameLike(String Name);
}
