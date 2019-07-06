package edu.gdkm.weixin.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.gdkm.weixin.library.domain.Book;
import edu.gdkm.weixin.library.service.LibraryService;

@Controller
@RequestMapping("/kemao_3/library/index")
public class IndexController {

	@Autowired
	private LibraryService libraryService;

	@RequestMapping
	public String index(//
			// 搜索的关键字
			@RequestParam(name = "keyword", required = false) String keyword,
			// 分页的页码，Spring Data里面建议从0开始的，所以默认值是0
			@RequestParam(name = "pageNumber", defaultValue = "0") int pageNumber, //
			Model model//
	) {

		Page<Book> page = this.libraryService.search(keyword, pageNumber);

		// 把数据传递到页面
		model.addAttribute("page", page);

		return "/WEB-INF/views/library/index.jsp";
	}
}
