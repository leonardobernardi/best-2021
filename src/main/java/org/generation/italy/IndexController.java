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
		dune.put("titolo", "Dune");
		dune.put("immagine", "https://mr.comingsoon.it/imgdb/locandine/235x336/55957.jpg");
		theLastDuel.put("immagine", "https://pad.mymovies.it/filmclub/2019/09/049/locandinapg1.jpg");
		theLastDuel.put("titolo", "The Last Duel");
		theGreenKnight.put("immagine", "https://upload.wikimedia.org/wikipedia/en/0/09/The_Green_Knight_poster.jpeg");
		theGreenKnight.put("titolo", "The Green Knight");
		movieList.add(dune);
		movieList.add(theLastDuel);
		movieList.add(theGreenKnight);
		model.addAllAttributes(dune);
		model.addAllAttributes(theGreenKnight);
		model.addAllAttributes(theLastDuel);
		model.addAllAttributes(movieList);
		return "movies";
	}
	
	@GetMapping("/songs")
	public String songs(Model model) {
		List<Map<String, String>> songList = new ArrayList<Map<String, String>>();
		Map<String, String> waiting = new HashMap<>();
		Map<String, String> tear = new HashMap<>();
		Map<String, String> ifYou = new HashMap<>();
		waiting.put("titolo", "Waiting on a War - Foo Fighters");
		waiting.put("immagine", "https://i0.wp.com/endofacentury.it/wp-content/uploads/2021/01/image.png?resize=768%2C416&ssl=1");
		tear.put("immagine", "https://www.revolvermag.com/sites/default/files/media/images/article/mastodonteardrinker.jpeg");
		tear.put("titolo", "Teardrinker - Mastodon");
		ifYou.put("immagine", "https://media.pitchfork.com/photos/6137afbe9e3d3f59b297db7c/1:1/w_500/kidamnesia.jpeg");
		ifYou.put("titolo", "If you say the word - Radiohead");
		songList.add(waiting);
		songList.add(tear);
		songList.add(ifYou);
		model.addAllAttributes(waiting);
		model.addAllAttributes(tear);
		model.addAllAttributes(ifYou);
		model.addAllAttributes(songList);
		model.addAttribute("songs", Arrays.asList("Waiting on a War - Foo Fighters", "Teardrinker - Mastodon", "If you say the word - Radiohead"));
	
		return "songs";
	}
	
	

	
}
