package name.mrkandreev.exampleunexpectedrollbackexception.repository;

import name.mrkandreev.exampleunexpectedrollbackexception.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainRepository extends JpaRepository<Item, Long> {
}
