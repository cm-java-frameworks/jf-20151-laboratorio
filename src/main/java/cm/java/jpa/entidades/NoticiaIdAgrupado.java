package cm.java.jpa.entidades;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class NoticiaIdAgrupado implements Serializable {

  // ======================================
  // =             Atributos              =
  // ======================================

  private String titulo;
  private String idioma;

  // ======================================
  // =            Construtores            =
  // ======================================

  public NoticiaIdAgrupado() {
  }

  public NoticiaIdAgrupado(String tituloParam, String idiomaParam) {
    titulo = tituloParam;
    idioma = idiomaParam;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getIdioma() {
    return idioma;
  }

  public void setIdioma(String idioma) {
    this.idioma = idioma;
  }

  // ======================================
  // =         hash, equals, toString     =
  // ======================================

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    NoticiaIdAgrupado noticiaId = (NoticiaIdAgrupado) o;

    if (!idioma.equals(noticiaId.idioma)) return false;
    if (!titulo.equals(noticiaId.titulo)) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = titulo.hashCode();
    result = 31 * result + idioma.hashCode();
    return result;
  }
}