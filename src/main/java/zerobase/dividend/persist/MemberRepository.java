package zerobase.dividend.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.dividend.persist.entity.MemberEntity;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

    Optional<MemberEntity> findByUsername(String username);

    boolean existsByUsername(String username);
//
//    boolean existsByEmail(String email);
//    boolean existsByUsernameAndEmail(String username, String email);
//    boolean existsByEmailAndUsername(String email, String username);
//    boolean existsByUsernameAndEmailAndPassword(String username, String email, String password);
//    boolean existsByEmailAndUsernameAndPassword(String email, String username, String password);
//
}
