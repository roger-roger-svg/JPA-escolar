package orm.actions;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.modelo.Aluno;

public class SearchAluno {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		String sql = "SELECT s FROM Aluno AS s";

		Query query = manager.createQuery(sql);
		
		@SuppressWarnings("unchecked")
			List<Aluno> lista = query.getResultList();
			
			for (Aluno aluno : lista) {
				System.out.println(aluno.getNome());
			}

		}

	}
}
