package be.ehb.recyclerdemo.model;

import java.io.Serializable;

// serializable nodig om data door te geven voor navigatie

public class Joke implements Serializable {

    private String setUp, punchline;

    public Joke() {
    }

    public Joke(String setUp, String punchline) {
        this.setUp = setUp;
        this.punchline = punchline;
    }

    public String getSetUp() {
        return setUp;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setSetUp(String setUp) {
        this.setUp = setUp;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }
}
