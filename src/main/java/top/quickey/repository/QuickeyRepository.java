package top.quickey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import top.quickey.entity.Quickey;

@Repository
public interface QuickeyRepository extends JpaRepository<Quickey,Integer>{
    @Query(value = "select * from quickey_ide_dict where id = ?",nativeQuery = true)
    Quickey findQuickeyById(Integer id);
}
