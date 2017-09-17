package org.fyh.spirngdemo2.controller;

import org.boot.tech.core.model.Game;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/local")
public class LocalRepositoryController {
	@RequestMapping(value="/game",method=RequestMethod.GET)
	public Object game(){
		Game game = new Game();
		game.setCompany("网易");
		return game;
	}
}
