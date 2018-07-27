package com.calcengine;

public class Main {

    public static void main(String[] args) {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(100.0d, 50.0d, 'd');
        equations[1] = new MathEquation(100.0d, 50.0d, 'a');
        equations[2] = new MathEquation(100.0d, 50.0d, 's');
        equations[3] = new MathEquation(100.0d, 50.0d, 'm');


        for(MathEquation equation : equations) {
            equation.execute();
            System.out.println("Result: " + equation.getResult());
        }

        System.out.println();
        System.out.println("Using Overloads");

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("Overload result = ");
        System.out.println(equationOverload.getResult());

        System.out.println();
        System.out.println("Using Inheritance");
        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(20.0d, 20.0d),
                new Subracter(40.0d, 5.0d),
                new Multiplier(5.0d, 4.0d)
        };

        for(CalculateBase calculator : calculators) {
            calculator.calculate();
            System.out.println(calculator.getResult());
        }

    }
}
