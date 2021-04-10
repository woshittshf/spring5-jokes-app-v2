package guru.springframe.spring5jokesapp.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokeService implements JokeService{

    @Override
    public String sayJoke() {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        return chuckNorrisQuotes.getRandomQuote();
    }
}
