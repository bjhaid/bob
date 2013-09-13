package com.vasconsulting;

public class Bob {

  public String talk(String discussion){
    if (discussion.matches("\\s+") || discussion.isEmpty()){
      return "Fine. Be that way!";
    } else if (discussion == discussion.toUpperCase()){
      return "Woah, chill out!";
    } else if (discussion.endsWith("?")){
      return "Sure";
    }
    else return "Whatever.";
  }
}
