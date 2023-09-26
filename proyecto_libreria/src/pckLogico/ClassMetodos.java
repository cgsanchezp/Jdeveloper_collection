package pckLogico;

import java.util.ArrayList;

public class ClassMetodos {

   public static ArrayList Datos;
    String i,codigo;
   public double precio,descuento,aum,total_pago;
    public ClassMetodos() {
        Datos = new ArrayList();
    }
    public void AgregarDatos(ClassEncapsular nuevo){
        Datos.add(nuevo);
    }
       public ClassEncapsular obtenerDtos(int k){
       return (ClassEncapsular)Datos.get(k);
           
       }
       public int Tamaño(){
           return Datos.size();
       }
       public void Quitar(int k){
           Datos.remove(k);
       }
    
    public double precio_total(double precio,double cant){
       
       double precio_total;
         precio_total=precio*cant;
        return(precio_total);
    }
      
       public  double xigv(String i,double precio_total){
       double xigv;
          if(i.equalsIgnoreCase("IGV"));
              xigv=precio_total+0.19*precio_total;
        
          
           return(xigv);
       }
       public double descuento(String tipo_pago,double xigv){
       double descuento=0;
               if(tipo_pago.equalsIgnoreCase("efectivo"))
               {  descuento=0;}
              
               if(tipo_pago.equalsIgnoreCase("tarjeta credito"))
                { descuento=0.1*xigv;}
                 
                return(descuento); 
            
           }
                             
       
           
          
        
       public double aum(String tipo_credito,double xigv){
            double aum=0;
              if(tipo_credito.equalsIgnoreCase("semanal"))
                  { aum=0.2*xigv;}
              
              
               if(tipo_credito.equalsIgnoreCase("quincenal"))
                    {aum=0.3*xigv;}
                 
               
               
               if(tipo_credito.equalsIgnoreCase("mensual"))
                {aum=0.5*xigv;}
                
               
               return(aum);
           }
           
         
       
       public double  total_pago(double xigv,double desc,double aum){
           total_pago=(xigv+aum)-desc;
           return(total_pago);
       }
       
       public  String Codigo (String mar,String prod,String mod,int reg){
  String l1=String.valueOf(mar.charAt(0));
  String l2=String.valueOf(prod.charAt(1));
  String l3=String.valueOf(mod.charAt(2));
  codigo=""+l1+""+l2+""+l3+reg;
  return(codigo);
       }
   }

