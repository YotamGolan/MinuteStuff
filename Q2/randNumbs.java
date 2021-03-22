import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

//The main class for Question 2. Run as shown in randomNumRunner.java. 
public class randNumbs{
    private LinkedList<Integer> number_Holder;
    public AtomicInteger current_Index = new AtomicInteger(0);
    private Boolean no_More_Numbers_Flag = false;

    public randNumbs(int how_many){
        initiliazeNumbers(how_many);
        //System.out.println(number_Holder);
    }

    private void initiliazeNumbers(int how_many){
        number_Holder = new LinkedList<>();
        for(int i = 1; i <= how_many; i++){
            number_Holder.add(i);
        }

        Collections.shuffle(number_Holder);
    }

    public Integer get_next_number()
    {
        if(no_More_Numbers_Flag)
            return 0;

        int index = current_Index.getAndIncrement();

        if(index >= number_Holder.size()-1){
            no_More_Numbers_Flag = true;
            return 0;
        }

        return number_Holder.get(index);
    }

    
}