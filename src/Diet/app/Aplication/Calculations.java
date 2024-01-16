package Diet.app.Aplication;


public class Calculations extends DietFrame {

     String gender;
     public static double resultBMI;
    public static double BMIResult(double weight, double height){
         resultBMI = weight/Math.pow(height/100,2);
        return Math.round(resultBMI);
    }
    public static double KCALResult(String gender, double age, double weight, double height) {
        double result = 0.0;
        if ("kobieta".equals(gender)) {
            result =  655.1 + (9.563 * weight) + (1.85 * height) - (4.676 * age);
        } else if ("mężczyzna".equals(gender)) {
            result =  66.473 + (13.752 * weight) + (5.003 * height) - (6.775 * age);
        }
        return Math.round(result);
    }
    public static String BMINormsResultsVoid(){
        if(resultBMI<18.5){
            return "za niskie, masz niedowagę.";
        }else if(resultBMI>=18.5 && resultBMI<24.99){
            return "w normie, masz prawidłową wagę.";
        }else if(resultBMI>=25){
            return "za duże, masz nadwagę.";
        }
        return null;
    }
}
