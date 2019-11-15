package org.corrales.noteapp.model;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * A note is composed of a title, a body and it is the core object of the system.
 */

@Entity
public class Note {

	@Id
	private UUID id;
	private String title;
	private String body;
	private LocalDateTime created;
	private LocalDateTime updateded;

	/**
	 * Returns unique identifier of a note
	 */
	
	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	public LocalDateTime getCreated() {
		return created;
	}
	
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	
	public LocalDateTime getUpdateded() {
		return updateded;
	}
	
	public void setUpdateded(LocalDateTime updateded) {
		this.updateded = updateded;
	}
	
}
