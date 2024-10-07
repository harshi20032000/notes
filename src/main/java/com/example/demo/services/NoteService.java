package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Note;

public interface NoteService {

	Note createNoteForUser(String username, String content);
	
	Note updateNoteForUser(Long noteId, String username, String content);
	
	void deleteNoteForUser(Long noteId, String username);
	
	List<Note> getNotesForUser(String username);
}

