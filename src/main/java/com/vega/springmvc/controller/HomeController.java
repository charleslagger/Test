package com.vega.springmvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//	@RequestMapping("/fname={fName}&ackurl={ackUrl}&mkey={mKey}")
//	public ModelAndView uri(Model model, @PathVariable(value = "fName") String fileName,
//			@PathVariable(value = "ackUrl") String ackUrl, @PathVariable(value = "mKey") String key) {
//		List<Map<String, String>> lists = getList(fileName);
//		// tham chieu toi mainView.jsp
//		ModelAndView mav = new ModelAndView("index");
//		mav.addObject("lists", lists);
//		model.addAttribute("fName", fileName);
//		return mav;
//	}
	
	public List<Map<String, String>> getList(String fileName){
		String[] splitSemicolon = fileName.split(";");
		String[] tails = new String[splitSemicolon.length];
		
		for(int i = 0; i < splitSemicolon.length; i++){
			tails[i] = splitSemicolon[i].substring(splitSemicolon[i].indexOf("_") + 1);
			splitSemicolon[i] = splitSemicolon[i].substring(0, splitSemicolon[i].length() - 2);
		}
		
		List<Map<String, String>> lists = new ArrayList<Map<String, String>>();
		
		for(int i = 0; i < splitSemicolon.length; i++) {
			Map<String, String> map = new HashMap<String, String>();
			map.put(splitSemicolon[i], tails[i]);
			lists.add(map);
		}
		
		return lists;
	}
	
	@RequestMapping("/fname={fName}&ackurl={ackUrl}&mkey={mKey}")
	public String test(Model model,
			@PathVariable(value = "fName") String fileName,
			@PathVariable(value = "ackUrl") String ackUrl,
			@PathVariable(value = "mKey") String mKey) {
		
		return "contentView";
	}
}
