package top.quickey.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.quickey.dao.QuickeyDao;
import top.quickey.entity.Quickey;
import top.quickey.services.QuickeyService;

@Service
public class QuickeyServiceImpl implements QuickeyService {

    @Autowired
    private QuickeyDao quickeyDao;

    @Override
    public Quickey findQuickeyById(Integer id) {
        return quickeyDao.findQuickeyById(id);
    }


}
