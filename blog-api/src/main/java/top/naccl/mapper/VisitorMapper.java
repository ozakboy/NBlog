package top.naccl.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.naccl.entity.Visitor;

import java.util.List;

/**
 * @Description: 访客统计持久层接口
 * @Author: Naccl
 * @Date: 2021-01-31
 */
@Mapper
@Repository
public interface VisitorMapper {
	List<Visitor> getVisitorList();

	int hasUUID(String uuid);

	int saveVisitor(Visitor visitor);

	int deleteVisitorById(Long id);
}