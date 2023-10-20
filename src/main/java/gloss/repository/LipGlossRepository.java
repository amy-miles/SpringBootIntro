package gloss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gloss.beans.LipGloss;

@Repository
public interface LipGlossRepository extends JpaRepository<LipGloss, Long> {
	
}
