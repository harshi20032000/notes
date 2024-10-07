package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Note;
import com.example.demo.repositories.NoteRepository;
import com.example.demo.services.NoteService;

@Service
public class NoteServiceImpl implements NoteService {

	@Autowired
	private NoteRepository noteRepository;

	@Override
	public Note createNoteForUser(String username, String content) {
		Note note = new Note();
		note.setContent(content);
		note.setOwnerUsername(username);

		return noteRepository.save(note);
	}

	@Override
	public Note updateNoteForUser(Long noteId, String username, String content) {
		Optional<Note> byId = noteRepository.findById(noteId);
		if (byId.isPresent()) {
			Note note = byId.get();
			note.setContent(content);
			note.setOwnerUsername(username);
			return noteRepository.save(note);
		}
		return null;
	}

	@Override
	public void deleteNoteForUser(Long noteId, String username) {
		Optional<Note> byId = noteRepository.findById(noteId);
		if (byId.isPresent()) {
			Note note = byId.get();
			noteRepository.delete(note);
		}

	}

	@Override
	public List<Note> getNotesForUser(String username) {
		return noteRepository.findByOwnerUsername(username);
	}

}
