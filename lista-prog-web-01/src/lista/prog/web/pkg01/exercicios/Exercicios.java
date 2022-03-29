/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.prog.web.pkg01.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Exercicios {
    private final double PI = 3.14159265;
    public void exercicio_1(){
       JOptionPane.showMessageDialog(null,"Hello World","Exercicio 01", JOptionPane.PLAIN_MESSAGE);
       System.exit(0); 
    }
    
    public void exercicio_3(){
        // TODO code application logic here
        double r = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite abaixo o raio da circuferencia (use ponto ao inves de virgula): "));
        double a = PI * (r * r);
        JOptionPane.showMessageDialog(null, "A Área da circuferencia é: "+a);
        System.exit(0); 
    }
    
    public void exercicio_8(){
        boolean situacao = false;
        int faltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de faltas: "));
        
        if(faltas > 16){
            JOptionPane.showMessageDialog(null, "Você foi reprovado por falta");
        }else{
            double mediaF = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua media final"));
            if(mediaF >= 7){
                situacao = true;
            }else{
                if(mediaF >= 4 & mediaF < 7){
                    //aluno de AF
                    double af = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da sua AF"));
                    //AF >= 4 and ((MF + AF) / 2) >= 5:
                    if(af >= 4 & ((mediaF + af)/2) >= 5 ){
                        situacao = true;
                    }else{
                        situacao = false;
                    }
                }else{
                    situacao = false;
                }
            }
            String mensagem = situacao?"Voce foi aprovado":"Você foi reprovado";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
    
    public void exercicio_21(){
        int[] todos = new int [20];
        int[] pares;
        int[] impares;
        int pContador = 0, iContador = 0;
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero inteiro: "));
        
        
      
    }
    
    public void exercicio_22(){
        String st1 = JOptionPane.showInputDialog(null,"Digite a primeira String");
        String st2 = JOptionPane.showInputDialog(null,"Digite a segunda String");
        String comprimento = st1.length() == st2.length()? "Comprimentos iguais":"Comprimentos diferentes";
        String conteudo = st1.equals(st2)? "Conteudos iguais":"Conteudos diferentes";
        System.out.println(st1 + " " + st2 + "\n"+ comprimento + ", " + conteudo);
       
    }
}
