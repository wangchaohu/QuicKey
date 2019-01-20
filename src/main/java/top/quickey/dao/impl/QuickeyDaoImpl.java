package top.quickey.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.quickey.dao.QuickeyDao;
import top.quickey.entity.Quickey;
import top.quickey.repository.QuickeyRepository;
@Repository
public class QuickeyDaoImpl implements QuickeyDao {
    @Autowired
    private QuickeyRepository studentRepository;

    @Override
    public Quickey findQuickeyById(Integer id) {
        return studentRepository.findQuickeyById(id);
    }
}
