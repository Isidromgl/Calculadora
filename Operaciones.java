package modelo;

public class Operaciones {
	 //variables que guardan los números
    //sobres los que trabajaremos
    int num1, num2;
    //constructor que sirve para inicializar
    //los atributos num1 y num2
    public void Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    public void Calculadora(int n){
        num1=n;
        num2=n;
    }
    public void Calculadora(){
        num1=1;
        num2=10;
    }
    
    //métodos para estblecer valores
    //en los números
    public void fijarNum1(int n){
        num1=n;
    }
    public void fijarNum2(int n){
        num2=n;
    }
    public int sumar(){
        int sum=num1+num2;
        return sum;
    }
    public int restar(){        
        return num1-num2;
    }
    public int multiplicar(){        
        return num1*num2;
    }
    public int dividir(){       
        return num1/num2;
    }

}
