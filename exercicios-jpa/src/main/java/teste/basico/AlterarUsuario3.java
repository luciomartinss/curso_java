package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-JPA");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		em.detach(usuario); // metado para desassociar o objeto para eviar alteraçoes automaticas
		//detach retira o objeto de seu estado erenciavel
		usuario.setNome("Leonardo");
		
		
		//em.merge(usuario); coloca o objeto em estado gerenciavel
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
