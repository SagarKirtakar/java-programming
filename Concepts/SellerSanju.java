package Concepts;

public class SellerSanju implements CustomerRaju {

    @Override
    public void purchase() {
        System.out.println("Raju needs: "+rice+"Kg rice");
    }
    
    public static void main(String[] args) {
        CustomerRaju cr = new SellerSanju();
        cr.purchase();
    }
}
