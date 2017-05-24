package app.service;

import app.mapper.ItemMapper;
import app.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xdcao on 2017/5/23.
 */
@Service
public class ItemService {

    @Autowired
    private ItemMapper itemMapper;

    public Item getItemById(long id){
        return itemMapper.getOne(id);
    }


    public List<Item> getAllItems(){
        return itemMapper.getAll();
    }

    public void insertItem(Item item){
        itemMapper.insert(item);
    }

    public void updateItem(Item item){
        itemMapper.update(item);
    }

    public void deleteItemById(long id){
        itemMapper.delete(id);
    }

}