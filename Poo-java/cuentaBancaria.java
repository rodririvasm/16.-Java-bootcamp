public class cuentaBancaria {

    //atributos

        String institutcion=" ";
        String beneficiario=" ";
        float saldo= 0;
        long cuenta= 0;
        String producto=" ";
        String direccion=" ";
        String rfc=" ";

    //metodos
    public void depositos(float monto) {
        this.saldo=this.saldo+monto;
    }

    public void retiros(float monto) {
        if(monto<this.saldo && monto>0){
            this.saldo=this.saldo-monto;
        }
    }

    public float consultarSaldo() {
        return this.saldo;
    }

    public String  estadodecuenta(){
        return "";
    }

}
