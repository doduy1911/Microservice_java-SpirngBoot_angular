package doduy.accountService.DAO;

import doduy.accountService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface loginReponsitory extends JpaRepository<User , Long> {
}
