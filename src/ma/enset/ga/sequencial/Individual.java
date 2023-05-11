package ma.enset.ga.sequencial;

import java.util.Random;

public class Individual implements Comparable{
    //Bonjour
    //chromosome
    private char genes[]=new char[7];
    private String lettres="abcdefghijklmnopqrstuvwxyz";
    private String bonjour="bonjour";

    private int fitness;

    public Individual() {
        Random rnd=new Random();
        for (int i=0;i<genes.length;i++){
            int index= rnd.nextInt(26);
            genes[i]=lettres.charAt(index);
        }
    }
    public void calculateFitness(){
        fitness=0;
        for (int i=0;i<genes.length;i++){
            if(bonjour.charAt(i)==genes[i]){
                fitness=fitness+1;
            }
        }
    }

    public int getFitness() {
        return fitness;
    }

    public char[] getGenes() {
        return genes;
    }

    @Override
    public int compareTo(Object o) {
        Individual individual=(Individual) o;
        if (this.fitness>individual.fitness)
            return 1;
        else if(this.fitness<individual.fitness){
            return -1;
        }else
            return 0;
    }
}
