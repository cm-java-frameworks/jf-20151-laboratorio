package cm.java.jpa.entidades;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_livro_heranca_por_classe_sobrescrita")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "livro_id")),
        @AttributeOverride(name = "titulo", column = @Column(name = "livro_titulo")),
        @AttributeOverride(name = "descricao", column = @Column(name = "livro_descricao"))
})
public class LivroHerancaPorClasseSobrescrita extends ItemHerancaPorClasseSobrescrita {

  // ======================================
  // =             Atributos              =
  // ======================================

  private String isbn;
  private String editora;
  private Integer nroDePaginas;
  private Boolean ilustracoes;
  private String descricao;

  // ======================================
  // =            Construtores            =
  // ======================================

  public LivroHerancaPorClasseSobrescrita() {
  }

  public LivroHerancaPorClasseSobrescrita(String tituloParam, Float precoParam, String descricaoParam, String isbnParam, String editoraParam, Integer nroDePaginasParam, Boolean ilustracoesParam) {
    super(tituloParam, precoParam, descricaoParam);
    isbn = isbnParam;
    editora = editoraParam;
    nroDePaginas = nroDePaginasParam;
    ilustracoes = ilustracoesParam;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getEditora() {
    return editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public Integer getNroDePaginas() {
    return nroDePaginas;
  }

  public void setNroDePaginas(Integer nroDePaginas) {
    this.nroDePaginas = nroDePaginas;
  }

  public Boolean getIlustracoes() {
    return ilustracoes;
  }

  public void setIlustracoes(Boolean ilustracoes) {
    this.ilustracoes = ilustracoes;
  }

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}
  
  
}