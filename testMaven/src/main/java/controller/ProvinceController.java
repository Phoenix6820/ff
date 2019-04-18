package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import entity.City;
import entity.Province;
import service.CityService;
import service.ProvinceService;

@Controller
public class ProvinceController {
	@Autowired
	ProvinceService pService;
	@Autowired
	CityService cService;

	@RequestMapping("show")
	public ModelAndView show() {
		ModelAndView mv = new ModelAndView("show");
		List<Province> pros = pService.searchAll();

		int pId = pros.get(0).getId();
		List<City> citys = cService.searchByPId(pId);

		mv.addObject("pros", pros);
		mv.addObject("citys", citys);
		return mv;
	}

	@RequestMapping("change")
	public ModelAndView change(int pId) {
		ModelAndView mv = new ModelAndView("show");
		List<Province> pros = pService.searchAll();

		List<City> citys = cService.searchByPId(pId);
		mv.addObject("pId", pId);

		mv.addObject("pros", pros);
		mv.addObject("citys", citys);
		return mv;
	}

	@RequestMapping(value = "change2", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public List<City> change2(int pId) {

		List<City> citys = cService.searchByPId(pId);
		// String json=ToJson.changeJson(citys);
		// String str = "[";
		// for (int i = 0; i < citys.size(); i++) {
		// str +="{\"id\":"+citys.get(i).getId() + ",\"name\":\"" +
		// citys.get(i).getName() + "\"},";
		// }
		// str=str.substring(0,str.length()-1);
		// str +="]";
		return citys;
	} 
}
