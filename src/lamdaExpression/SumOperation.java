package lamdaExpression;

public class SumOperation {
    int getSum(int a, int b){
        Operator temp = (x,y) -> {
            return a + b;
        };
        return temp.toOperate(a,b);

    }

}
