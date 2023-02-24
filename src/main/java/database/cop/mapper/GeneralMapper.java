package database.cop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GeneralMapper {

    @Select("select #{arg1} from #{arg2} where #{arg3} #{arg4} #{arg5}")
    public String selectOne(String arg1, String arg2, String arg3, String arg4, String arg5);

    @Select("select #{arg1}, #{arg2} from #{arg3} where #{arg4} #{arg5} #{arg6}")
    public String selectTwo(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6);

    @Select("select count(*) from #{arg1} where #{arg2} #{arg3} #{arg4}")
    public int count(String arg1, String arg2, String arg3, String arg4);
}
