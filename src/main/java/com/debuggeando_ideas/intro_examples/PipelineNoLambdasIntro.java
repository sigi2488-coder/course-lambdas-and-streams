package com.debuggeando_ideas.intro_examples;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

import java.util.ArrayList;
import java.util.List;

public class PipelineNoLambdasIntro {

    public static void main(String[] args) {
        List<Videogame> videogames = Database.videogames;

        List<String> r = new ArrayList<>(20);

        for (Videogame v: videogames) {
            if (!r.contains(v.getName())) {
                if (v.getPrice() > 10) {
                    r.add(v.getName().toUpperCase());
                }
            }
        }
        for (String videogameTitle: r) {
            System.out.println(videogameTitle);
        }
    }
}
