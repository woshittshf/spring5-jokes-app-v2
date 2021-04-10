package guru.springframe.spring5jokesapp.controllers;

import guru.springframe.spring5jokesapp.services.ChuckNorrisJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    private final ChuckNorrisJokeService chuckNorrisJokeService;

    public MyController(ChuckNorrisJokeService chuckNorrisJokeService) {
        this.chuckNorrisJokeService = chuckNorrisJokeService;
    }

    @RequestMapping({"/", ""})
    public String sayJoke(Model model) {

        model.addAttribute("joke", chuckNorrisJokeService.sayJoke());

        return "index";
    }
}
