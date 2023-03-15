package view;

import java.text.ParseException;
import java.util.Scanner;

import model.Calculo;
import model.CustoVenda;
import model.Fibonacci;
import model.Hotel;
import model.Meses;
import model.ParImparPrimo;
import model.Tabuada;
import model.ParesImpares;

public class Visualizacao {

	public static void main(String[] args) throws ParseException {
		
		System.out.println("----- QUESTÃO 01 -----");
		
		Tabuada x = new Tabuada();
		
		System.out.println("\nDigite um número: ");
		
		Scanner input = new Scanner (System.in);
		
		x.setX(input.nextInt());
		
		System.out.println("\nNúmero escolhido: " + x.getX());
		System.out.println("");
		
		Tabuada y = new Tabuada();
		
		y.setY(0);
		
		Tabuada z = new Tabuada();
		
		while (y.getY() <= 10) {
			
			z.setZ(x.getX() * y.getY());
			
				System.out.println(x.getX() + " x " + y.getY() + " = " + z.getZ());
			
				y.setY(y.getY() + 1);
			
		}
		
		System.out.println("\n----- QUESTÃO 02 -----");
		
		System.out.println("\nInforme sua primeira variável: ");
		
		Calculo var1 = new Calculo();
		
		Scanner inputt1 = new Scanner(System.in);
		
		var1.setVar1(inputt1.nextDouble());
		
		System.out.println("Informe sua segunda variável: ");
		
		Calculo var2 = new Calculo();
		
		Scanner inputt2 = new Scanner(System.in);
		
		var2.setVar2(inputt2.nextDouble());
		
		System.out.println("\nAs variáveis determinadas foram: " + var1.getVar1() + " e " + var2.getVar2());

		System.out.println("\nSelecione qual oporação será efetuada apartir das opções abaixo:");
		System.out.println("\n1 = +");
		System.out.println("2 = -");
		System.out.println("3 = *");
		System.out.println("4 = /");
		System.out.println("");
		
		Calculo oper = new Calculo();
		
		Scanner inputt3 = new Scanner(System.in);
		
		oper.setOper(inputt3.nextInt());
		
		if (oper.getOper() == 1) {
			System.out.println("\nResultado da soma:");
			System.out.println(var1.getVar1() + var2.getVar2());
			
		} else if (oper.getOper() == 2) {
			System.out.println("\nResultado da subtração:");
			System.out.println(var1.getVar1() - var2.getVar2());
			
		} else if (oper.getOper() == 3) {
			System.out.println("\nResultado da multiplicação:");
			System.out.println(var1.getVar1() * var2.getVar2());
			
		} else if (oper.getOper() == 4) {
			System.out.println("\nResultado da divisão:");
			System.out.println(var1.getVar1() / var2.getVar2());
			
		}
		
		System.out.println("\n----- QUESTÃO 03 -----");
		
		System.out.println("\nSequência Fibonacci");
		System.out.println("");
		
		Fibonacci zero = new Fibonacci();
		Fibonacci num = new Fibonacci();
		
		zero.setZero(0);
		num.setNum(1);      
		
        for (int i = 0; i < 11; i++){
        	
        	num.setNum(num.getNum() + zero.getZero());

        	zero.setZero(num.getNum() - zero.getZero());

            System.out.println(num.getNum());
			
		}
        
        System.out.println("\n----- QUESTÃO 04 -----");
        
        ParesImpares mult = new ParesImpares();
        mult.setMult(1);
        
        ParesImpares soma = new ParesImpares();
        soma.setSoma(0);
        
        for (int i = 1; i <= 30; i++) {
        	
        	if (i % 2 == 0) {
        		mult.setMult(mult.getMult() * i);
        		//a *= i;
        		//a = a * i;
        		
        	} else {
        		soma.setSoma(soma.getSoma() + i);
        		//b += i;
        		
        	}        	
        }
		
        System.out.println("\nSoma dos números ímpares de 0 a 30: " + soma.getSoma());
        System.out.println("Multiplicação dos números pares de 0 a 30: "+ mult.getMult());
        
        System.out.println("\n----- QUESTÃO 05 -----");
        
        System.out.println("\nInsira um valor: ");
        
        ParImparPrimo val = new ParImparPrimo();
        
        Scanner inputtt = new Scanner(System.in);
        
        val.setVal(inputtt.nextDouble());
        
        if ((val.getVal() % 2) == 0) {
        	System.out.println("O valor inserido é PAR");
        	
        } else {
        	System.out.println("Valor inserido é ÍMPAR");
        	
        System.out.println("");	
        	
        } for (int i = 2; i < val.getVal(); i++) {
        	
        	if ((val.getVal() % i) != 0) {
        		
        		System.out.println("O Valor inserido é PRIMO");
        	
        	} else {
        		
        		System.out.println("O Valor inserido NÃO É PRIMO");
        		
        	}	
        }		
        		
        System.out.println("\n----- QUESTÃO 06 e 07 -----");
        
        System.out.println("\nInforme as horas de trabalho: ");
        
        Hotel hrs = new Hotel();
        
        Scanner inputttt = new Scanner(System.in);
        
        hrs.setHrs(inputttt.nextDouble());
        
        System.out.println("\nValor por hr de trabalho: 12,25 R$");
        
        hrs.setHrs(hrs.getHrs() * 12.25);
        
        System.out.println("\nSeu salário é de: " + hrs.getHrs() + " R$");
        
        if (hrs.getHrs() < 50.0) {
        	System.out.println("Atenção, dirija-se à direção do Hotel!");
        	
        }
        
        System.out.println("\n----- QUESTÃO 08 -----");
        
        System.out.println("\nInforme o preço de custo do produto: ");
        
        CustoVenda custo = new CustoVenda();
        
        Scanner inputtttt1 = new Scanner (System.in);
        
        custo.setCusto(inputtttt1.nextDouble());
        
        System.out.println("Informe o preço de venda do produto: ");
        
        CustoVenda venda = new CustoVenda();
        
        Scanner inputtttt2 = new Scanner (System.in);
        
        venda.setVenda(inputtttt2.nextDouble());
        
        CustoVenda luc = new CustoVenda();
        luc.setLuc((custo.getCusto() / 2) + custo.getCusto());
        
        CustoVenda dif = new CustoVenda();
        dif.setDif(venda.getVenda() - custo.getCusto());
        
        if (venda.getVenda() >= luc.getLuc()) {
        	System.out.println("\nLUCRO: " + dif.getDif() + " R$");
        	
        } else if (venda.getVenda() < custo.getCusto()) {
        	System.out.println("\nPREJUÍZO: " + dif.getDif() + " R$");
        	
        }
          
        System.out.println("\n----- QUESTÃO 09 -----");
        
		System.out.println("\nOBS: Números válidos apenas de 1 a 12 ");
        System.out.println("Digite o número do mês: ");
          
        Meses mes = new Meses();
          
        Scanner inputttttt = new Scanner (System.in);
          
        mes.setMes(inputttttt.nextInt());
          
        System.out.println("");
          
        if (mes.getMes() == 1) {
        	  System.out.println("Mês correspondente: Janeiro");
        	  
        } else if (mes.getMes() == 2) {
        	  System.out.println("Mês correspondente: Fevereiro");
        	  
        } else if (mes.getMes() == 3) {
        	  System.out.println("Mês correspondente: Março");
        	  
        } else if (mes.getMes() == 4) {
        	  System.out.println("Mês correspondente: Abril");
        	  
        } else if (mes.getMes() == 5) {
        	  System.out.println("Mês correspondente: Maio");
        	  
        } else if (mes.getMes() == 6) {
        	  System.out.println("Mês correspondente: Junho");
        	  
        } else if (mes.getMes() == 7) {
        	  System.out.println("Mês correspondente: Julho");
        	  
        } else if (mes.getMes() == 8) {
        	  System.out.println("Mês correspondente: Agosto");
        	  
        } else if (mes.getMes() == 9) {
        	  System.out.println("Mês correspondente: Setembro");
        	  
        } else if (mes.getMes() == 10) {
        	  System.out.println("Mês correspondente: Outubro");
        	  
        } else if (mes.getMes() == 11) {
        	  System.out.println("Mês correspondente: Novembro");
        	  
        } else if (mes.getMes() == 12) {
        	  System.out.println("Mês correspondente: Dezembro");
        	  
        } else if (mes.getMes() < 1) {
        	  System.out.println("ERRO: Número/Mês inválido!");
        	  
        } else if (mes.getMes() > 12) {
        	  System.out.println("ERRO: Número/Mês inválido!");
        	  
        }
         
	}
}