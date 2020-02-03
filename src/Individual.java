import java.util.ArrayList;
import java.util.Collections;

public class Individual {

    private Element[] gene;
    private int score;

    public Individual(){
        gene = ElementParser.getElements();
        calcScore();
    }

    public Individual(Individual orig){
        gene = new ArrayList<>();

        calcScore();
    }

    public void calcScore(){
        double total = 0;
        for (int i = 0; i < gene.size()-1; i++) {
            total += gene.get(i).distanceTo(gene.get(i+1));
        }
        total += gene.get(0).distanceTo(gene.get(gene.size()-1));

        score = (int)total;
    }
    public void mutate(double rate){
        while(Math.random() < rate) {
            int j;
            int i = (int) (Math.random() * gene.size());
            do {
                j = (int) (Math.random() * gene.size());
            } while (j == i);
            Collections.swap(gene, i, j);
        }
        calcScore();
    }

    public int getScore() {
        return score;
    }

    public ArrayList<City> getGene() {
        return gene;
    }

    @Override
    public String toString() {
        return "" + score + " " + gene;
    }
}