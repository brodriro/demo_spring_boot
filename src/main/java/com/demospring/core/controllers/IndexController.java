package com.demospring.core.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demospring.core.models.Post;

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping()
	public String index(Model model) {
		model.addAttribute("posts", getPosts());
		return "index";
	}
	
	
	private List<Post> getPosts() {
		List<Post> mList = new ArrayList<>();
		mList.add(new Post(1, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type", "https://www.onblastblog.com/wp-content/uploads/2019/09/09aea00fc018749c1c255ddfd594b218.jpeg", new Date()));
		mList.add(new Post(1, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type", "https://www.simplilearn.com/ice9/free_resources_article_thumb/How_to_Become_an_Angular_Developer.jpg", new Date()));
		mList.add(new Post(1, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type", "https://www.immigration.ca/wp-content/uploads/2018/07/Where-to-Get-the-Best-Salary-as-a-Software-Developer-in-Canada_112185177.jpeg", new Date()));
		return mList;
	}

}
