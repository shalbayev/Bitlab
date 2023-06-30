package lamdaExpression;

public class MultiplyOperation {
    int getMultiplication(int a, int b){
        Operator temp = (x,y) -> x*y;

        return temp.toOperate(a,b);
    }
}
