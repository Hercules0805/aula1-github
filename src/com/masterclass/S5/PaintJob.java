package com.masterclass.S5;

public class PaintJob {


    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        System.out.println(getBucketCount(-3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,1.5));
    }

    //width = largura do muro
    //height = altura do muro
    // areaPerBucket = área que pode ser pintada com uma lata de tinta
    // extraBuckets = latas de tinta extras na casa do Bob
    // retorno int = numero de baldes que bob precisa comprar antes de ir trabalhar




    public static int getBucketCount (double width, double height, double areaPerBucket, double extraBuckets){

        if((width<=0) || (height<=0) || (areaPerBucket<=0)){
            return -1;
        } else {
            double wallArea = width * height;
            double neededBuckets = wallArea / areaPerBucket;
            int finalBuckets = (int) Math.round(neededBuckets-extraBuckets);

            return finalBuckets;
        }


    }

    public static int getBucketCount (double width, double height, double areaPerBucket){

        if((width<=0) || (height<=0) || (areaPerBucket<=0)){
            return -1;
        } else {
            double wallArea = width * height;
            double neededBuckets = wallArea / areaPerBucket;
            int finalBuckets = (int) Math.round(neededBuckets);

            return finalBuckets;
        }


    }


    public static int getBucketCount (double area, double areaPerBucket){
        if((area<=0) || (areaPerBucket<=0)){
            return -1;
        } else {
            int neededBuckets = (int) Math.round(area / areaPerBucket);

            return neededBuckets+1;
        }

    }


}
