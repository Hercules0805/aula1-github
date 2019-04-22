package Teste1;

public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("Hercules", 10);

        int resultado = calculateHighScorePosition(10);

        System.out.println("Reultado do Score: "+resultado);

    }

    public static void calculateScore(int score, int levelCompleted, int bonus){
        int finalScore = score + (levelCompleted * bonus);
        finalScore += 1000;
        System.out.println("Final Score: "+ finalScore);
    }



    public static void displayHighScorePosition(String name, int position){
        System.out.println("O jogador: "+name+" está ocupando a posiçao: "+position+" da tabela!");

    }


    public static int calculateHighScorePosition(int score){
        if(score>1000){
            return 1;
        }else if(score >500 && score <1000){
            return 2;
        }else if(score >100 && score <500){
            return 3;
        }else{
            return 4;



        }
    }
}
