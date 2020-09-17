package com.mycompany.kubg.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mycompany.kubg.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	//의존성 주입
	@Inject
	private SqlSession sql;
	
	//매퍼
	private static String namespace = "com.mycompany.kubg.memberMapper";
	
	//회원 가입
	@Override
	public void signup(MemberVO vo) throws Exception {
		sql.insert(namespace + ".signup", vo);
	}

	@Override
	public MemberVO signin(MemberVO vo) throws Exception {
		return sql.selectOne(namespace + ".signin", vo);
	}

}
