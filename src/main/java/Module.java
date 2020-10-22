import java.util.ArrayList;

public class Module {
    private String moduleName;
    private String moduleID;
    private final ArrayList<Student> students = new ArrayList<>();
    private final ArrayList<Course> courses = new ArrayList<>();

    public Module(String moduleName,String moduleID) {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
    }

    public String getModuleName() {return moduleName;}
    public void setModuleName(String name){moduleName=name;}

    public String getModuleID(){return moduleID;}
    public void setModuleID(String id){moduleID = id;}


}
