package clases;

public class Conversor {

    public String Decimal_Binary(int i) {

        String binary = "";
        String ordenated_binary = "";

        while (i > 0) {

            binary += i % 2;
            i /= 2;

        }

        for (int j = binary.length(); j > 0; j--) {

            ordenated_binary += binary.substring(j - 1, j);

        }

        return ordenated_binary;

    }

    public int Binary_Decimal(String i) {

        int decimal = 0;
        int counter_potency = 0;
        int value_potency;

        for (int j = i.length(); j > 0; j--) {

            String temp = i.substring(j - 1, j);

            int _temp = Integer.parseInt(temp);
            
            if(_temp == 1){
            value_potency = (int) Math.pow(2, counter_potency);

            decimal += _temp * value_potency;

            }
        counter_potency++;
        
        }
        

        return decimal;
    }
}
