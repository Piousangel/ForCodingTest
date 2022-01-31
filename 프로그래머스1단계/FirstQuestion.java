public class FirstQuestion {

    public static void main(String[] args)
    {
        BinaryOp adder = new Adder();
        BinaryOp mult = new Multiflier();
        Binder calc = new Calculator();

        int addResult = calc.calc(0,1,1,10, adder);
        int mulResult = calc.calc(1,1,1,10, mult);

        System.out.println(addResult);
        System.out.println(mulResult);
    }

    public staitc BinaryOp 
}
