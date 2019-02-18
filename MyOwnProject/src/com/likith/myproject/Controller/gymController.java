package com.likith.myproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.likith.myproject.dao.gymDAO;
import com.likith.myproject.entity.gym;
import com.likith.myproject.service.GymService;

import java.util.*;

@Controller
@RequestMapping("/gym")
public class gymController {

	@Autowired
	GymService gymservice;
	
	@RequestMapping("/list")
	public String getList(Model themodel) {
		List<gym>gyms = gymservice.getGyms();
		themodel.addAttribute("gyms",gyms);
		return "list-customers";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		gym gym1 = new gym();
		theModel.addAttribute("gym",gym1);
		return "gym-form";
	}
	
	@PostMapping("/saveGym")
	public String saveGym(@ModelAttribute("gym")gym theGym)
	{    
		
		gymservice.saveGym(theGym);
		return "redirect:/gym/list";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("gymid") int theId,Model theModel) {
		gym thegym = gymservice.getGym(theId);
		theModel.addAttribute("gym",thegym);
		return "gym-form";
	}
	@GetMapping("deleteItem")
	public String deleteItem(@RequestParam("gymid")int theId,Model theModel) {
		
		gymservice.deleteItem(theId);
		return "redirect:/gym/list";
	}
}
