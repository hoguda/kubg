package com.mycompany.kubg.service;


import java.util.List;

import com.mycompany.kubg.domain.CategoryVO;
import com.mycompany.kubg.domain.GoodsVO;
import com.mycompany.kubg.domain.GoodsViewVO;

public interface AdminService {

	//카테고리
	public List<CategoryVO> category() throws Exception;
	
	//상품 등록
	public void register(GoodsVO vo) throws Exception;

	//상품 목록
	public List<GoodsVO> goodsList() throws Exception;
	
	//상품 상세 + 카테고리 조인
	public GoodsViewVO goodsView(int gdsNum) throws Exception;
	
	//상품 수정
	public void goodsModify(GoodsVO vo) throws Exception;
	
	//상품 삭제
	public void goodsDelete(int gdsNum) throws Exception;
	
}
