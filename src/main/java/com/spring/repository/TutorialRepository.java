package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.spring.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	 List<Tutorial> findByPublished(boolean published);
	  List<Tutorial> findByTitleContaining(String title);

}
