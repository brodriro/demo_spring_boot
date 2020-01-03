package com.demospring.core.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.demospring.core.models.Post;

@Controller
@RequestMapping("/")
public class IndexController {
	
	public static List<Post> allPosts = new ArrayList();

	@GetMapping()
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		model.addObject("content", "list");
		model.addObject("posts", getPosts());
		return model;
	}
	
	
	private List<Post> getPosts() {
		if(allPosts.size() > 0) return allPosts;
	
		allPosts.add(new Post(1, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type", "https://www.onblastblog.com/wp-content/uploads/2019/09/09aea00fc018749c1c255ddfd594b218.jpeg", new Date()));
		allPosts.add(new Post(2, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type", "https://www.simplilearn.com/ice9/free_resources_article_thumb/How_to_Become_an_Angular_Developer.jpg", new Date()));
		allPosts.add(new Post(3, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type", "https://www.immigration.ca/wp-content/uploads/2018/07/Where-to-Get-the-Best-Salary-as-a-Software-Developer-in-Canada_112185177.jpeg", new Date()));
		
		return allPosts;
	}
	
	@GetMapping("/create")
	public ModelAndView create() {
		ModelAndView model = new ModelAndView("index");
		model.addObject("post", new Post());
		model.addObject("content", "create");
		return model;
	}
	
	@PostMapping("/create/save")
	public RedirectView savePost(@ModelAttribute Post post) {
		post.setId(allPosts.size() -1 );
		post.setDate(new Date());
		
		this.allPosts.add(post);
		
		RedirectView redirectView = new RedirectView("/", true);
		return redirectView;
	}

	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("index");
		model.addObject("content", "list");
		model.addObject("posts", getPosts());
		return model;
	}
}
