package fit.challenge;

public class ImcCalculator {


    public static String calculate(double weigth,double height )
    {
        double ImcResult = weigth / (height * height);
        
        if (ImcResult < 18.5) return "Magreza";
        if (ImcResult < 25.00) return "Normal";
        if (ImcResult < 30) return "Sobrepeso";
        
        return "Obesidade";

    }


}