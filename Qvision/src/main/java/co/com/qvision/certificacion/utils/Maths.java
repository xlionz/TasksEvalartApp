package co.com.qvision.certificacion.utils;

public class Maths {

    public static String Operation(String mathOperation) {
        double result = 0.0;
        String finalResult;

        String noMinus = mathOperation.replace("-", "+-");
        String[] byPluses = noMinus.split("\\+");

        for (String multi :byPluses){
            String[] byMulti = multi.split("\\*");
            double multiResult = 1.0;
            for (String operand: byMulti){
                if (operand.contains("/")){
                    String[] division = operand.split("\\/");
                    double divident = Double.parseDouble(division[0]);
                    for (int i = 1; i < division.length; i++){
                        divident /= Double.parseDouble(division[i]);
                    }
                    multiResult *= divident;
                }else {
                    multiResult *= Double.parseDouble(operand);
                }
            }
            result += multiResult;
        }

        finalResult = Double.toString(result);

        return finalResult.split("\\.")[0];
    }

}
