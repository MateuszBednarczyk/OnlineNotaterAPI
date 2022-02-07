package com.example.onlinenotaterapi.Models;

import javax.persistence.*;

@Entity
@Table(name = "notes")
public class Note {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long noteId;
  private String noteTitle;
  private String noteContent;
  private String noteAuthor;

  public Note(String noteTitle, String noteContent, String noteAuthor) {
    this.noteTitle = noteTitle;
    this.noteContent = noteContent;
    this.noteAuthor = noteAuthor;
  }

  public Note() {
  }

  public long getNoteId() {
    return noteId;
  }

  public void setNoteId(long noteId) {
    this.noteId = noteId;
  }


  public String getNoteTitle() {
    return noteTitle;
  }

  public void setNoteTitle(String noteTitle) {
    this.noteTitle = noteTitle;
  }


  public String getNoteContent() {
    return noteContent;
  }

  public void setNoteContent(String noteContent) {
    this.noteContent = noteContent;
  }


  public String getNoteAuthor() {
    return noteAuthor;
  }

  public void setNoteAuthor(String noteAuthor) {
    this.noteAuthor = noteAuthor;
  }

}
