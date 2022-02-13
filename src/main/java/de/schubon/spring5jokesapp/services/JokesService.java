package de.schubon.spring5jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService {

    private final ChuckNorrisQuotes quotes;

    public JokesService() {
        quotes = new ChuckNorrisQuotes();
    }

    public String produceJoke() {
        return quotes.getRandomQuote();
    }
}
