package be.ehb.recyclerdemo.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class JokeViewModel extends ViewModel {

// lijst maken van de moppen

    private MutableLiveData <ArrayList <Joke> > jokes;

    // deze data observaarbaar maken Mutable live data
    // Wat heb jij nodig om een object op te vragen


    public JokeViewModel() {
    }
// alleen mopjes opvragen nog geen maken
    //normaal komt dit uit een database of backend webservice
    public MutableLiveData<ArrayList<Joke>> getJokes() {
        if(jokes==null){
            jokes= new MutableLiveData<>();
            ArrayList<Joke> templateJokes= new ArrayList<>();
            templateJokes.add(new Joke("Het is blauw en weegt niet veel","lichtblauw"));
            templateJokes.add(new Joke("Het is groen en glijdt van een berg","slawine"));
            templateJokes.add(new Joke("Het is blauw en weegt niet veel","lichtblauw"));

            jokes.setValue(templateJokes );
        }
        return jokes;
    }
}
