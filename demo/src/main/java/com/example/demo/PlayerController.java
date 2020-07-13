package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

	@GetMapping("/players")
	public List<Player> getEmployee() {

		List<Player> players = new ArrayList<Player>();

		Player player1 = new Player();
		player1.setId(1);
		player1.setFirstName("MS");
		player1.setLastName("Dhoni");
		player1.setSportsName("Cricket");
		players.add(player1);

		Player player2 = new Player();
		player2.setId(2);
		player2.setFirstName("PV");
		player2.setLastName("Sindhu");
		player2.setSportsName("Badminton");
		players.add(player2);

		return players;
	}
}
