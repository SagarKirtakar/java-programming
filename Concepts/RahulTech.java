package Concepts;

public class RahulTech extends RajTech {

    @Override
    public void webDev() {
        System.out.println("Web development by usign java , SpringBoot");
    }
    
    public static void main(String[] args) {
        Client2 cl2 = new RahulTech();
        cl2.webDesign();
        cl2.webDev();
    }
}
