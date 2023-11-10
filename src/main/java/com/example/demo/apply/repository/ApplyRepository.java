package com.example.demo.apply.repository;

import com.example.demo.entity.Apply;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyRepository extends JpaRepository<Apply, Long> {
    boolean existsBySiteUser_IdAndMatching_Id(long userId, long matchingId);

    Optional<Apply> findBySiteUser_IdAndMatching_Id(long userId, long matchingId);

    Optional<List<Apply>> findAllByMatching_IdAndStatus(long matchingId, Enum accepted);

    Optional<Integer> countByMatching_IdAndStatus(long matchingId, Enum pending);
}
