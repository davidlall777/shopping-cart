package com.shoppingcartapp.service;

import com.shoppingcartapp.model.Item;

public interface ItemService {
	public Item createItem(Item item);
	public Item getItem(String itemID, String itemName);
	public Item updateItem(Item item);
	public boolean deleteItem(Item item);
}
