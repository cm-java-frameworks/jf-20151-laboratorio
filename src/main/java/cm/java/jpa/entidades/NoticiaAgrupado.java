package cm.java.jpa.entidades;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "noticias")
public class NoticiaAgrupado implements Serializable{

  /**
	 * 
	 */
	private static final long serialVersionUID = -3455472349456309140L;
// ======================================
  // =             Atributos              =
  // ======================================

  @EmbeddedId
  private NoticiaIdAgrupado id;
  private String conteudo;

  // ======================================
  // =            Construtores            =
  // ======================================

  public NoticiaAgrupado() {
  }

  public NoticiaAgrupado(NoticiaIdAgrupado id, String content) {
    this.id = id;
    this.conteudo = content;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public NoticiaIdAgrupado getId() {
    return id;
  }

  public void setId(NoticiaIdAgrupado id) {
    this.id = id;
  }

  public String getConteudo() {
    return conteudo;
  }

  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }
}
