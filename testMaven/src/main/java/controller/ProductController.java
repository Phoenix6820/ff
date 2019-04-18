package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import entity.Product;
import service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService proService;

	@RequestMapping("list")
	public ModelAndView showList() {
		ModelAndView mv = new ModelAndView("list");
		List<Product> list = proService.searchAll();
		mv.addObject("list", list);
		System.out.println("sdf");
		return mv;
	}
	

}
