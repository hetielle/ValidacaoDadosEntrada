package aplicacao;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean valido = false;

		do{
			System.out.println("Digite seu nome:");
			String nome = sc.nextLine();
			//começar por letra maiúscula e os sobrenomes também. Só são aceitas letras, espaço e o apóstrofo.
			if(Pattern.matches("[A-Z][a-zA-Z']*\s[A-Z][a-zA-Z']*", nome)) {
				System.out.println("Dados válidos!");
				valido = true;
			} else {
				System.out.println("Dados inválidos!");
			}
		} while(valido==false);
		
		valido = false;
		do{
			System.out.println("Digite seu email:");
			String email = sc.next();
			//começa com letra minúscula; Após, podem haver números, _, - e .; Após deve conter um @; 
			//após deve ser formado o domínio, com no mínimo 3 letras em cada etapa do domínio, separadas por um .; ao final, devem haver 2 ou 3 letras.
			if(Pattern.matches("[a-z][a-zA-Z0-9-_\\.]*[@][a-zA-Z]{3,}[.][a-zA-Z]{2,3}", email)) {
				System.out.println("Dados válidos!");
				valido = true;

			} else {
				System.out.println("Dados inválidos!");
			}
		} while(valido==false);

		valido = false;
		do{
			System.out.println("Digite sua data de nascimento:");
			String data = sc.next();		
			//deve ser no formato dd/mm/aaaa. Considere que todos os meses possuem 31 dias
			if(Pattern.matches("[0-9 &&[^456789]]{1}[0-9]{1}[//][0-9 &&[^23456789]]{1}[0-9]{1}[//][0-9]{4}", data)) {
				System.out.println("Dados válidos!");
				valido = true;
			} else {
				System.out.println("Dados inválidos!");
			}
		} while(valido==false);

		valido = false;
		do{
			System.out.println("Digite seu CPF:");
			String cpf = sc.next();	
			//deve ser no formado xxx.xxx.xxx-xx
			if(Pattern.matches("[0-9]{3}[\\.][0-9]{3}[\\.][0-9]{3}[-][0-9]{2}", cpf)) {
				System.out.println("Dados válidos!");
				valido = true;
			} else {
				System.out.println("Dados inválidos!");
			}
		} while(valido==false);

		valido = false;
		do{
			System.out.println("Digite seu CNPJ:");
			String cnpj = sc.next();
			//deve ser no formato xx.xxx.xxx/0001 ou 0002-xx
			// [0-9]{2}[\\.][0-9]{3}[\\.][0-9]{3}
			if(Pattern.matches("[0-9]{2}[\\.][0-9]{3}[\\.][0-9]{3}[//](0001[-][0-9]{2}|0002[-][0-9]{2})", cnpj)) {
				System.out.println("Dados válidos!");
				valido = true;
			} else {
				System.out.println("Dados inválidos!");
			}
		} while(valido==false);

		valido = false;
		do{
			System.out.println("Digite sua idade:");
			String idade = sc.next();
			//devem ser 1, 2 ou 3 digitos
			if(Pattern.matches("[0-9]{1,3}", idade)) {
				System.out.println("Dados válidos!");
				valido = true;
			} else {
				System.out.println("Dados inválidos!");
			}
		}while(valido==false);

		valido = false;
		do{
			System.out.println("Digite seu CEP:");
			String cep = sc.next();
			//deve ser no formato xxxxx-xx
			if(Pattern.matches("[0-9]{5}[-][0-9]{2}", cep)) {
				System.out.println("Dados válidos!");
				valido = true;
			} else {
				System.out.println("Dados inválidos!");
			}
		}while(valido==false);

		valido = false;
		do{
			System.out.println("Digite os dígitos do seu cartão de crédito:");
			String cartao = sc.next();
			//deve ser no formato xxxx-xxxx-xxxx-xxxx
			if(Pattern.matches("[0-9]{4}[-][0-9]{4}[-][0-9]{4}[-][0-9]{4}", cartao)) {
				System.out.println("Dados válidos!");
				valido = true;
			} else {
				System.out.println("Dados inválidos!");
			}
		}while(valido==false);

		valido = false;
		do{
			System.out.println("Digite a data de validade do seu cartão de crédito:");
			String val = sc.next();
			//mm/aa
			if(Pattern.matches("[0-9 &&[^23456789]]{1}[0-9][//][0-9]{2}", val)) {
				System.out.println("Dados válidos!");
				valido = true;
			} else {
				System.out.println("Dados inválidos!");
			}
		}while(valido==false);

		sc.close();
	}

}
