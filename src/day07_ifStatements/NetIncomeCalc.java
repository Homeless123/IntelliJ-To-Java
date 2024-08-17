package day07_ifStatements;

import javax.management.MBeanAttributeInfo;

public class NetIncomeCalc {
    /*
    Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax

     */
    public static void main(String[] args) {
         int Salary=130000;

        boolean isMarried =true;

        double taxRate= 0;

        if(Salary>=130000){// if the salary 130k or more (excluded) then the tax rate should be 30%
            taxRate=0.35;
        }
        if(Salary>=100000&&Salary<130000){// if the salary between 100k to 130 (excluded) then the tax rate should be 30%
            taxRate=0.30;
        }
        if (Salary>=80000&&Salary<100000){// if the salary between 100k to 80k (excluded) then the tax rate should be 30%
            taxRate=0.25;
        }
        if (Salary<80000){// if the salary less than 80000k (excluded) then the tax rate should be 30%
            taxRate=0.2;
        }

        if (isMarried){ // if the person is merried
            taxRate -=0.05;// tax is reduced by 5%
        }

        double totalTax=Salary*taxRate;
        double NetIncome=Salary*(1-taxRate);

        System.out.println("Salary = " + Salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("Net Income: "+NetIncome);



    }
}
