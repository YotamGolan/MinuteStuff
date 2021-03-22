public class List {

private static Folder root;
private static Theme chosen_Theme;
private static String chosen_Offset = "";
    public static void main(String[] args){
        create_Objects();
        if(args.length == 0)
            set_Theme("A");
        else if(args.length == 2)
            set_Theme(args[1]);
        else{
            System.out.println("Error: Proper Args not given");
            return;
        }
        printOut();
    }

    private static void create_Objects() {
        root = new Folder("Root Folder", "admin");
        root.add(new File("Test", ".qq" , 100000));
        root.add(new File("Test1", ".zip" , 1040000));
        root.add(new File("Test2", ".qq" , 101000));
        Folder Guest = new Folder("Games But Diff", "Guest?");
        Guest.add(new File("Test", ".qq" , 100000));
        Guest.add(new File("Test1", ".qz" , 1040000));
        Guest.add(new File("Test2", ".aq" , 101000));
        Folder Guest2 = new Folder("Games", "Guest");
        Guest2.add(new File("Test", ".qq" , 100000));
        Guest2.add(new File("Test1", ".q5" , 1040000));
        Guest2.add(new File("Test2", ".1q" , 101000));
        Guest2.add(Guest);
        root.add(Guest2);
        root.add(Guest);

    }

    private static void set_Theme(String theme_code) {
        chosen_Theme = new Theme(theme_code);
    }
    
    private static void printOut(){
        root.Print(chosen_Theme, chosen_Offset);
    }
}
