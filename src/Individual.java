import java.util.ArrayList;
import java.util.Collections;

public class Individual {

    private static Element[] elements = ElementParser.getElements();

    private boolean[] gene;
    private int score;

    public Individual(){
        gene = new boolean[elements.length];
        for (int i = 0; i < gene.length; i++) {
            gene[i] = Math.random() < .3;
        }
        calcScore();
    }

    public Individual(Individual orig){
        gene = new boolean[elements.length];
        for (int i = 0; i < gene.length; i++) {
            gene[i] = orig.gene[i];
        }
        calcScore();
    }

    public void calcScore(){
        double total = 0;

    }

    public void mutate(double rate){
        while(Math.random() < rate) {
            int j;
            int i = (int) (Math.random() * gene.length);
            do {
                j = (int) (Math.random() * gene.length);
            } while (j == i);
            Collections.swap(gene, i, j);
        }
        calcScore();
    }

    public int getScore() {
        return score;
    }

    public boolean[] getGene() {
        return gene;
    }

    @Override
    public String toString() {
        return "" + score + " " + gene;
    }
}