public class Theme {
    private String folder_Color = "\u001B[37m";
    private String file_Color = "\u001B[34m";

    public Theme(String theme_Code){
        switch (theme_Code){
            case "A" :  folder_Color = "\u001B[37m";
                        file_Color = "\u001B[34m";
                        break;
            case "B" :  folder_Color = "\u001B[33m";
                        file_Color = "\u001B[31m";
                        break;
            

        }
    }

    public String folColor(){
        return folder_Color;
    }

    public String filColor(){
        return file_Color;
    }
}
