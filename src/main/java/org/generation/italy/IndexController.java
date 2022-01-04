package org.generation.italy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		List<Map<String, String>> movieList = new ArrayList<Map<String, String>>();
		Map<String, String> dune = new HashMap<>();
		Map<String, String> theLastDuel = new HashMap<>();
		Map<String, String> theGreenKnight = new HashMap<>();
		dune.put("Dune", "https://mr.comingsoon.it/imgdb/locandine/235x336/55957.jpg");
		theLastDuel.put("The Last Duel", "https://pad.mymovies.it/filmclub/2019/09/049/locandinapg1.jpg");
		theGreenKnight.put("The Green Knight", "https://upload.wikimedia.org/wikipedia/en/0/09/The_Green_Knight_poster.jpeg");
		movieList.add(dune);
		movieList.add(theLastDuel);
		movieList.add(theGreenKnight);
		model.addAllAttributes(movieList);
		model.addAllAttributes(dune);
		model.addAllAttributes(theGreenKnight);
		model.addAllAttributes(theLastDuel);
		return "movies";
	}
	
	@GetMapping("/songs")
	public String songs(Model model) {
		model.addAttribute("songs", Arrays.asList("Waiting on a War - Foo Fighters", "Teardrinker - Mastodon", "If you say the word - Radiohead"));
		return "songs";
	}
	
	

	
}
