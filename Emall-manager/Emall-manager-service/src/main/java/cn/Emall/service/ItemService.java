package cn.Emall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.Emall.mapper.TbItemMapper;
import cn.Emall.pojo.TbItem;
@Service
public class ItemService {

	/*
	 * 需求:根据商品id查询商品数据
	 * 参数:Long itemId
	 * 返回值 TbItem
	 */
	
	 // 注入商品mapper接口代理对象
	@Autowired
	 private TbItemMapper itemMapper;
	
	public TbItem findItemById(Long itemId){
		TbItem item = itemMapper.selectByPrimaryKey(itemId);
		return item;
	}
}
