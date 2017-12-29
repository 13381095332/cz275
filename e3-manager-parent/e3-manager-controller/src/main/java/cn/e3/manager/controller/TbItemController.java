package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.e3.manager.service.TbItemService;
import cn.e3.pojo.TbItem;

@RestController
public class TbItemController {
	@Autowired
	private TbItemService tbItemService;
	
	@RequestMapping("findItem/{id}")
	public TbItem findItem(@PathVariable("id")Long ItemId){
		TbItem tbItem = tbItemService.findItemById(ItemId);
		return tbItem;
	}
  
}
