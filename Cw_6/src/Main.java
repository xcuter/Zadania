import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random gen = new Random();
        List<Double> DoubleArray = new ArrayList<>(gen.nextInt(100));
        int ElementsNumber = gen.nextInt(100);
        for(int i =0; i < ElementsNumber;i++){
            DoubleArray.add(gen.nextDouble()*10);
        }
        System.out.println(DoubleArray.toString());
        DoubleArray.sort(Double::compareTo);
        //System.out.println(DoubleArray.toString());
        double Average =DoubleArray.stream().mapToDouble(Double::doubleValue).sum() / (double) ElementsNumber;
        System.out.println("Average = "+Average);
        double med = 0.0;
        if(DoubleArray.size() % 2 == 0){
            med = (DoubleArray.get(DoubleArray.size()/2) + DoubleArray.get((DoubleArray.size()/2)+1) )/2.0;
        }else {
            med = DoubleArray.get(DoubleArray.size()/2);
        }
        System.out.println("Median = "+med);
        }
    }
