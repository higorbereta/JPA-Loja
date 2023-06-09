package br.com.alura.loja.teste;

import br.com.alura.loja.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {
    public static void main(String[] args) {
        Produto celular = new Produto();
        celular.setNome("Xiaomi Redmi");
        celular.setDescricao("MuitoLegal");
        celular.setPreco(new BigDecimal("800"));

        /* */
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(celular);
        entityManager.getTransaction().commit();
        entityManager.close();



    }
}
