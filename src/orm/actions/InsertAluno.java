package orm.actions;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Aluno;

	public class InsertAluno {
		
		
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		System.out.println("digite as informacoes do aluno")
		System.out.print("nome: ");
		String nome = input.nextLine();
		aluno.setNome(nome);
		
		
		System.out.print("email ");
		String email = input.nextLine();
		aluno.setEmail(email);
		
		
		System.out.print("CPF ");
		Int cpf = input.nextInt();
		aluno.setCpf(cpf);
		
		System.out.print("Data de nascimento ");
		String dataNascimento = input.nextLine();
		aluno.setDataNascimento(dataNascimento);
		
		System.out.print("naturalidade ");
		String naturalidade = input.nextLine();
		aluno.setNaturalidade(naturalidade);
		
		System.out.print("endereço ");
		String endereco = input.nextLine();
		aluno.setEndereço(endereco);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(aluno1);
		manager.getTransaction().commit();
		
		System.out.println("Aluno inserida, id: "+aluno.getId());
		
		manager.close();
		factory.close();
}
