package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Note;
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

	List<Note> findByOwnerUsername(String username);
}
