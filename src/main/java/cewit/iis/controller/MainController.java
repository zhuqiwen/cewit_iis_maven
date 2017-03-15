package cewit.iis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import cewit.iis.model.UserEntity;
import cewit.iis.repository.UserRepository;

import java.util.List;

/**
 * Created by zqw on 3/14/17.
 */
@Controller
public class MainController {

	@Autowired
	UserRepository userRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index()
	{

		return "index";
	}

	@RequestMapping(value = "/admin/users", method = RequestMethod.GET)
	public String getUsers(ModelMap modelMap)
	{

//		List<UserEntity> userList = userRepository.findAll();
//		modelMap.addAttribute("userList", userList);

		return "admin/users";
	}
}
