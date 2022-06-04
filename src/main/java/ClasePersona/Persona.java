/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasePersona;

import java.util.Random;

/**
 *
 * @author bjls2
 */
public class Persona {
    static final String SEXO="Hombre";
    private static int SOBREPESO=1;
    private static int DEBAJOPESOIDEAL=0;
    private static int PESOIDEAL=-1;

    
    private String nombre;
    private String edad;
    private String dni;
    private String sexo;
    private int peso;
    private int altura;

    public Persona() {
        this.nombre="";
        this.edad="";
        this.dni="";
        this.sexo=SEXO;
        this.peso=0;
        this.altura=0;
    }

    public Persona(String nombre, String edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni="";
        this.peso=0;
        this.altura=0;
    }

    public Persona(String nombre, String edad, String sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = this.generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public int calcularIMC(){
        int IMC=(this.peso/(this.altura^2));
        if (IMC<20) {
            return PESOIDEAL;
        }
        else if(IMC>=20 && IMC <=25){
            return DEBAJOPESOIDEAL;
        }
        else{
            return SOBREPESO;
        }
        
    }
    public boolean esMayorDeEdad()
    {
        if (Integer.parseInt(this.edad)>=18)
            return true;
        return false;
    }
    public String toString(){
        return "Información de la persona\n Nombre: "+this.nombre+"\n Edad: "+this.edad+
                "\n DNI: "+this.dni+"\n Sexo: "+this.sexo+"\n Peso: "+this.peso+"\n Altura: "+this.altura;
    }
    public String generaDNI(){
        Random random = new Random();
        String DNI = "";
        for(int i = 1; i <=10; i++) {
            int value = random.nextInt((10 - 1) + 1) + 1;
            DNI.concat(String.valueOf(value));
        }
        return DNI;
    }
}
