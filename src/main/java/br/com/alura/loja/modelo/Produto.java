package br.com.alura.loja.modelo;


 /* ORM -> Object Relational Mapping */

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id /* Primary Key*/
    @GeneratedValue(strategy = GenerationType.IDENTITY) /* Qndo o campo é NULL, a JPA precisa saber como gerar um no registro*/
    private Long id;
    private String nome;
    @Column(name = "desc_prod")  /* Anotação Column ensina a JPA que o nome da coluna é diferente do atributo */
    private String descricao;
    private BigDecimal preco;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}


