
package dominio;

public class Vejez implements InterfacePension{

    @Override
    public void metodoPension() {
      int Pi=0;
      if(0<get.anio()<11){
      Pi=get.salario()*0.5+get.salario()*0.15;
      System.out.println("su Pension es: "+Pi);
      }
      if(10<get.anio()<21){
      Pi=get.salario()*0.6+get.salario()*0.15;
      System.out.println("su Pension es: "+Pi);
      }
      if(20<get.anio()<31){
      Pi=get.salario()*0.7+get.salario()*0.15;
      System.out.println("su Pension es: "+Pi);
      }
      if(30<get.anio()<36){
      Pi=get.salario()*0.8+get.salario()*0.15;
      System.out.println("su Pension es: "+Pi);
      }
      if(35<get.anio()<40){
      Pi=get.salario()*0.9+get.salario()*0.15;
      System.out.println("su Pension es: "+Pi);
      }
      if(39<get.anio()){
      Pi=get.salario()+get.salario()*0.15;
      System.out.println("su Pension es: "+Pi);
      }
    }
    
}
