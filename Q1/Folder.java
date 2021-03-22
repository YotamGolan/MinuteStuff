import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set; 

public class Folder extends SystemObject{
    private String Owner;
    private Set<SystemObject> subObjects;

    public Folder(String new_Name, String new_Owner, Set<SystemObject> new_subObjects){
        super.Name = new_Name;
        Owner = new_Owner;
        subObjects = new LinkedHashSet<SystemObject>(new_subObjects);
    }

    public Folder(String new_Name, String new_Owner){
        super.Name = new_Name;
        Owner = new_Owner;
        subObjects = new LinkedHashSet<SystemObject>();
    }

    public void add(SystemObject new_Object){
        subObjects.add(new_Object);
    }

    public String fileName(){
        return super.Name;
    }

    public String Owner(){
        return Owner;
    }

    public Set<SystemObject> Contents(){
        return subObjects;
    }

    @Override
    public void Print(Theme use_Theme, String offset){
        System.out.println(use_Theme.folColor() + offset +  super.Name + " ("+ Owner + ")\t" + "\u001B[0m");
        for(SystemObject sysObj : subObjects){
            sysObj.Print(use_Theme, offset + "\t");
        }
    }

}
