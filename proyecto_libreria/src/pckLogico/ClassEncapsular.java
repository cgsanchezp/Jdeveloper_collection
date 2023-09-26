package pckLogico;

public class ClassEncapsular {
    String i,mar,cod,prod,mod,codigo,tipoc,tipo_pago,tipo_credito;
    double xigv,descuento,credito,desc,precio,total_pago,aum,cant,precio_total;
int reg;
    public ClassEncapsular(String mar,String i,String prod,String mod,String tipoc,String codigo,String tipo_pago,String tipo_credito,
double credito,double desc,double xigv,double descuento,double aum ,double precio,double total_pago,double precio_total,double cant,int reg) {
        this.setMar(mar);
        this.setXigv(xigv);
        this.setDescuento(descuento);
        this.setI(i);
        this.setProd(prod);
        this.setMod(mod);
        this.setCodigo(codigo);
        this.setTipo_pago(tipo_pago);
        this.setTipo_credito(tipo_credito);
        this.setCredito(credito);
        this.setDesc(desc);
        this.setAum(aum);
        this.setCant(cant);
        this.setPrecio(precio);
        this.setTipoc(tipoc);
        this.setCant(cant);
        this.setTotal_pago(total_pago);
        this.setPrecio_total(precio_total);
        this.setReg(reg);
    }
    public ClassEncapsular(){
    }
    

   
  

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

   

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal_pago() {
        return total_pago;
    }

    public void setTotal_pago(double total_pago) {
        this.total_pago = total_pago;
    }


    public double getAum() {
        return aum;
    }

    public void setAum(double aum) {
        this.aum = aum;
    }

    public String getTipo_credito() {
        return tipo_credito;
    }

    public void setTipo_credito(String tipo_credito) {
        this.tipo_credito = tipo_credito;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public double getDesc() {
        return desc;
    }

    public void setDesc(double desc) {
        this.desc = desc;
    }

    public double getCant() {
        return cant;
    }

    public void setCant(double cant) {
        this.cant = cant;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }


    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getTipoc() {
        return tipoc;
    }

    public void setTipoc(String tipoc) {
        this.tipoc = tipoc;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public double getXigv() {
        return xigv;
    }

    public void setXigv(double xigv) {
        this.xigv = xigv;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getReg() {
        return reg;
    }

    public void setReg(int reg) {
        this.reg = reg;
    }
}
