package com.likith.myproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.likith.myproject.dao.gymDAO;
import com.likith.myproject.entity.gym;
import java.util.*;

@Controller
@RequestMapping("/gym")
public class gymController {

	@Autowired
	gymDAO gymdao;
	
	@RequestMapping("list")
	public String getList(Model themodel) {
		List<gym>gyms = gymdao.getGyms();
		themodel.addAttribute("gyms",gyms);
		return "list-customers";
	}
	
}
