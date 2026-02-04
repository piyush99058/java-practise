package OOPS.INHERITANCE;


class Microsoft{

    void windows(){
        System.out.println("Windows 11");
    }
}

class VisualStudio extends Microsoft{
     void  editor()
     {
        System.out.println("Worlds best editor");
     }
}
public class SingleInheritance {
    public static void main(String[] args) {
        VisualStudio v1 = new VisualStudio();
        v1.windows();


    }
}
