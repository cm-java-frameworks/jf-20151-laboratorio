package cm.java.jpa.consultas;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@NamedStoredProcedureQuery(name = "arquivarLivrosVelhos", procedureName = "pa_arquivar_livros",
        parameters = {
                @StoredProcedureParameter(name = "dataArquivamento", mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(name = "maxLivrosArquivados", mode = ParameterMode.IN, type = Integer.class)
        })
@Table(name = "T_LIVRO_STPROC")
public class LivrosProcedimentoArmazenado {

  // ======================================
  // =             Atributos              =
  // ======================================

  @Id
  @GeneratedValue
  private Long id;
  private String titulo;
  private Float preco;
  private String descricao;
  private String isbn;
  private String editora;
  private Integer nroDePaginas;
  private Boolean ilustracoes;

  // ======================================
  // =            Construtores            =
  // ======================================

  public LivrosProcedimentoArmazenado() {
  }

  public LivrosProcedimentoArmazenado(String tituloParam, Float precoParam, String descricaoParam, String isbnParam, Integer nroDePaginasParam, Boolean ilustracoesParam, String editoraParam) {
    titulo = tituloParam;
    preco = precoParam;
    descricao = descricaoParam;
    isbn = isbnParam;
    nroDePaginas = nroDePaginasParam;
    ilustracoes = ilustracoesParam;
    editora = editoraParam;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Float getPreco() {
    return preco;
  }

  public void setPreco(Float preco) {
    this.preco = preco;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

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
}