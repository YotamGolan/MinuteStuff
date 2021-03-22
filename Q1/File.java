public class File extends SystemObject{
    private String Extension;
    private Integer Size;
    private char[] c = new char[]{'k', 'm', 'b', 't'};


    public File(String new_Name, String new_Extension, Integer new_Size){
        super.Name = new_Name;
        Extension = new_Extension;
        Size = new_Size;
    }

    public String fileName(){
        return super.Name;
    }

    public String fileExtension(){
        return Extension;
    }

    public Integer fileSize(){
        return Size;
    }

    @Override
    public void Print(Theme use_Theme, String offset){
        System.out.println(use_Theme.filColor() + offset + super.Name + Extension + " \t"+ formatSize(Size, 0) + "\u001B[0m");
    }

    private String formatSize(double curr_Value, int iteration){
        double d = ((long) curr_Value / 100) / 10.0;
        boolean isRound = (d * 10) %10 == 0;    //Checks if the decimal part is 0, and trims.
        return (d < 1000?                       //Determine the class 'scale'. IE k/m/g/t
            ((d > 99.9 || isRound || (!isRound && d > 9.99)?    //Decides on if to trim the decimal or not
            (int) d * 10 / 10 : d + ""          //Drops the Decimal
            ) + "" + c[iteration]) 
        : formatSize(d, iteration + 1));        //Loops back through

    }
}
