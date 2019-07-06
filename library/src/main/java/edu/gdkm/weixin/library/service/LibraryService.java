package edu.gdkm.weixin.library.service;

import org.springframework.data.domain.Page;

import edu.gdkm.weixin.library.domain.Book;
import edu.gdkm.weixin.library.domain.DebitList;

public interface LibraryService {

	Page<Book> search(String keyword, int pageNumber);

	void add(DebitList list, String bookId);

	void remove(DebitList list, String id);

}
