
public class SimpleClass {
    //attributs 
    private int attribut1;
    private String attribut2;

    //constructeur
    public SimpleClass(int attribut1, String attribut2) {
        this.attribut1 = attribut1;
        this.attribut2 = attribut2;
    }

    //getters et setters
    public int getAttribut1() {
        return attribut1;
    }
    //...
}

public class ComplexeClass extends SimpleClass {
    //attributs
    private int attribut3;
    private String attribut4;

    //constructeur
    public ComplexeClass(int attribut1, String attribut2, int attribut3, String attribut4) {
        super(attribut1, attribut2);
        this.attribut3 = attribut3;
        this.attribut4 = attribut4;
    }

    //getters & setters
    public int getAttribut3() {
        return attribut3;
    }
    //...
}