package org.generation.italy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("name", "Leonardo");
		return "index";
	}
	
	@GetMapping("/movies")
	public String movies(Model model) {
//		List<String> movies = new ArrayList<String>();
		
		model.addAttribute("movies", Arrays.asList("Dune", "The Last Duel", "The Green Knight"));
		return "movies";
	}
	@GetMapping("/songs")
	public String songs(Model model) {
		model.addAttribute("songs", Arrays.asList("Waiting on a War - Foo Fighters", "Teardrinker - Mastodon", "If you say the word - Radiohead"));
		return "songs";
	}
	
	

	
}
