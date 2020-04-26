import dao.MessageMapper;
import model.Message;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.InputStream;
import java.util.List;
//一个主函数 就可以启动mybatis，不依赖于spring！

public class Main {
    public static void main(String[] args) {
        //加载配置文件
        InputStream in = Main.class.getResourceAsStream("resources/mybatis-cfg.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        SqlSession session =factory.openSession();
        MessageMapper mapper = session.getMapper(MessageMapper.class);
        //从数据库获得数据
        List<Message> messages = mapper.listMessage();
        session.commit();
        session.close();
    }

}
