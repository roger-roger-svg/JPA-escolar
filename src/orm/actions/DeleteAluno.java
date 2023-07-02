package orm.actions;
import orm.model.Aluno;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DeleteAluno {
	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();       
		
        try (Scanner input = new Scanner(System.in)) {
			
        	System.out.println("Digite o ID do aluno para excluir: ");
        	aluno.setId(sc.nextLong());
        	
        	EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        	EntityManager manager = factory.createEntityManager();
        	
        	aluno = manager.find(Aluno.class, aluno.getId());
        	
        	if (aluno != null) {
        		
        		manager.getTransaction().begin();
        		manager.remove(aluno);
        		manager.getTransaction().commit();
        		
        		System.out.println("Excluido do banco de dados com sucesso");
        	}
        	manager.close();
        	factory.close();
		} catch (Exception e) {
			System.out.println("ID nao correspondente");
		}
        sc.close();
        
    }
}
	}
}
