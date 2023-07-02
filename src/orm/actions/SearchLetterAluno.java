package orm.actions;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.model.Aluno;
public class SearchLetterAluno {
	public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("inscritos");
        EntityManager manager = factory.createEntityManager();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a letra que deseja buscar: ");
        String letra = sc.nextLine();
        sc.close();
        
        String sql = "SELECT a FROM Aluno AS a WHERE LOWER(a.nome) LIKE :letra";
        Query query = manager.createQuery(sql);
        query.setParameter("letra", letra.toLowerCase()+"%");
        
        @SuppressWarnings("unchecked")
        List<Aluno> lista = query.getResultList();

        for (Aluno aluno : lista) {
            System.out.println(aluno.getNome());
        }
        manager.close();
        factory.close();
}
}