package cn.e3.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.service.TbItemService;
import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;

@Service
public class TbItemServiceImpl implements TbItemService {
	
	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public TbItem findItemById(Long ItemId) {
		TbItem tbItem = tbItemMapper.selectByPrimaryKey(ItemId);
		return tbItem;
	}

}
