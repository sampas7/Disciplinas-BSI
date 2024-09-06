
package terceiraquestao;

public class Dat3 {
    
    private int dia;
    private int mes;
    private int ano;
    
    public Dat3(int d, int m, int a){
        if(testaData(d,m,a)){
            this.dia = d;
            this.mes = m;
            this.ano = a;
                  
        }else{
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
                  
        }
        
    }
    
    public boolean testaData (int d, int m, int a){
        if  ((d>0&&d<=29)&&(m==2) && a>0){
            return true;
    
        }
        
        else if ((d>0&&d<=31) && (m==1) || (m>2&&m<=12) && a>0){
            return true;
            
            
        }else{
            return false;
            
        }
    }
    
    public String displayDate(){
        return this.dia+"/"+this.mes+"/"+this.ano;
        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}
