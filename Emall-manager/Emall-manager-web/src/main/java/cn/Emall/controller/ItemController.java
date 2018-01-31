package cn.Emall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.Emall.pojo.TbItem;
import cn.Emall.service.ItemService;
@RestController
public class ItemController {
	@Autowired
	private ItemService itemService;
/*
 * 需求:根据商品id 查询商品数据
 * 参数:Long itemId
 * 返回值:json格式TbItem
 */
 @RequestMapping("item/{itemId}")
 public TbItem  findItemById(@PathVariable Long itemId){
	TbItem item= itemService.findItemById(itemId);
	return item;
 }
}

