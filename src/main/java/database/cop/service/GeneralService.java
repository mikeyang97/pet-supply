package database.cop.service;

import database.cop.mapper.GeneralMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneralService {

    @Autowired
    GeneralMapper generalMapper;

    public String selectOne(String arg1, String arg2, String arg3, String arg4, String arg5){
        return generalMapper.selectOne(arg1, arg2, arg3, arg4, arg5).toString();
    }

    public String selectTwo(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6){
        return generalMapper.selectTwo(arg1, arg2, arg3, arg4, arg5, arg6).toString();
    }

    public int count(String arg1, String arg2, String arg3, String arg4){
        return generalMapper.count(arg1, arg2, arg3, arg4);
    }
}
