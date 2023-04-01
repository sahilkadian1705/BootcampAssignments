package Question3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public interface Operation {
    int operate(int a,int b);
}

@Component
class Subtraction implements Operation{
    public int operate(int a,int b){
        return a-b;
    }
}