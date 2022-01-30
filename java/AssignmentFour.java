package intro.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Kyc {
    Date signUpDate, currentDate;
    String stringStartDate, stringEndDate;
    Date startDate, endDate;

    public void range(String inputSignUpDate, String inputCurrentDate) {
        try {
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
            signUpDate = dateFormatter.parse(inputSignUpDate);
            currentDate = dateFormatter.parse(inputCurrentDate);
            if (signUpDate.after(currentDate)) {
                System.out.println("No range");
            } else {
                startDate = signUpDate;
                startDate.setYear(currentDate.getYear());
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(startDate);
                calendar.add(Calendar.DATE, -30);
                startDate = calendar.getTime();
                calendar.add(Calendar.DATE, 60);
                endDate = calendar.getTime();
                if (endDate.after(currentDate)) {
                    endDate = currentDate;
                }
            }
            stringStartDate = dateFormatter.format(startDate);
            stringEndDate = dateFormatter.format(endDate);
            System.out.print(stringStartDate);
            System.out.print("	 ");
            System.out.println(stringEndDate);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

};
public class AssignmentFour {

    public static void main(String[] args) {
        int t;
        String inputSignUpDate;
        String inputCurrentDate;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        Kyc k=new Kyc();
        for (int i = 0; i < t; i++) {
            inputSignUpDate = sc.nextLine();
            inputCurrentDate = sc.nextLine();
            k.range(inputSignUpDate, inputCurrentDate);
        }
    }
}

