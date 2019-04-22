package JavaCompleto2019.S3;

public class Student {
    private String name;
    private double firstTri;
    private double secontTri;
    private double thirdTri;

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstTri(double firstTri) {
        this.firstTri = firstTri;
    }

    public void setSecontTri(double secontTri) {
        this.secontTri = secontTri;
    }

    public void setThirdTri(double thirdTri) {
        this.thirdTri = thirdTri;
    }

    public void finalGrade(){
        double result =  (firstTri+secontTri+thirdTri);
        if(result>=60){
            System.out.println("Final Grade = "+result);
            System.out.println("PASS");
        }else {
            System.out.println("Final Grade = "+result);
            System.out.println("FAILED");
            System.out.println("MISSING "+(60-result)+ " POINTS");
        }
    }


}
