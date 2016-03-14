package de.chclaus.examples.controller;

import java.io.Serializable;

/**
 * @author Christian Claus (ch.claus@me.com)
 */
public class UserDTO implements Serializable {

  private String username;

  public String getUsername() {
    return username;
  }

  public UserDTO setUsername(String username) {
    this.username = username;
    return this;
  }
}