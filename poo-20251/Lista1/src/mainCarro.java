import javax.swing.*;
import exe0.Carro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class mainCarro {
    public static void main(String[] args) {
        //vamos criar um objeto da classe Carro
        // instância de uma classe é um objeto
        Carro obj1 = new Carro ();
        obj1.ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
        obj1.marca = JOptionPane.showInputDialog("Marca: ");
        obj1.modelo = JOptionPane.showInputDialog("Modelo: ");
        obj1.velocidade = Float.parseFloat(JOptionPane.showInputDialog("Velocidade: "));
        obj1.acelerar(80);
        obj1.frear(50);
        obj1.exibeDtalhes();
        obj1.exibeDtalhes2();

        Carro obj2 = new Carro ();
        obj2.ano = 2023;
        obj2.marca = "Chevrolet";
        obj2.modelo = "Spin";
        obj2.velocidade = 0;
        obj2.acelerar(80);
        obj2.frear(100);
        obj2.exibeDtalhes();
        obj2.exibeDtalhes2();

        Carro obj3 = new Carro ();
        obj3.ano = 2015;
        obj3.marca = "Chevrolet";
        obj3.modelo = "Celta";
        obj3.velocidade = 0;
        obj3.exibeDtalhes();
        obj3.exibeDtalhes2();

        Carro obj4 = new Carro ("Chevrolet", "Camaro", 2025, 0);
        obj4.exibeDtalhes();
        obj4.exibeDtalhes2();
    }
}