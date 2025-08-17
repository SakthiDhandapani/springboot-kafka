package sakthi.dhandapani;

import org.springframework.data.jpa.repository.JpaRepository;
import sakthi.dhandapani.entity.WikiMediaData;

public interface WikiMediaRepo extends JpaRepository<WikiMediaData,Long> {
}
