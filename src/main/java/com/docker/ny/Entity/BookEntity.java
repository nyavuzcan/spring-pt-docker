package com.docker.ny.Entity;

import javax.persistence.*;

@Entity
public class BookEntity {


  private Long id;

  private String name;

  private String ISBN;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "name")
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "ISBN")
  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }
}
