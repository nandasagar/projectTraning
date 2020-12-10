package com.mobile.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mobile.application.model.Image;
import com.mobile.application.model.Item;
import com.mobile.application.repository.ItemRepository;

@Controller

public class AccessoriesController {

	@Autowired
	private ItemRepository itemRepository;

	// to add the products
	@PostMapping("/saveaccess")
	public String saveaccess(Item item) {

		itemRepository.save(item);
		return "accessories";
	}

	Image image;

	@RequestMapping("/access")
	public String access() {
		return "/access";
	}

	@RequestMapping("/addaccess")
	public String addaccess() {
		return "/addaccess";
	}

	@PostMapping("/view-power")
	public ModelAndView power() {
		ModelAndView modelObject = new ModelAndView("accessview");
		try {
			String itemdesc = "powerbank";
			List<Item> item = (List<Item>) itemRepository.findByItemtype(itemdesc);
			modelObject.addObject("list", item);
		} catch (Exception exception) {
			System.out.println("Exception in Power Bank" + exception);
		}
		return modelObject;
	}

	@PostMapping("/view-headset")
	public ModelAndView headset() {
		ModelAndView modelObject = new ModelAndView("accessview");
		try {
			String itemdesc = "headset";
			List<Item> item = (List<Item>) itemRepository.findByItemtype(itemdesc);

			modelObject.addObject("list", item);
		} catch (Exception exception) {
			System.out.println("Exception in Head Set" + exception);
		}
		return modelObject;
	}

	@PostMapping("/view-charger")
	public ModelAndView charger() {
		ModelAndView modelObject = new ModelAndView("accessview");
		try {
			String itemdesc = "charger";
			List<Item> item = (List<Item>) itemRepository.findByItemtype(itemdesc);

			modelObject.addObject("list", item);
		} catch (Exception exception) {
			System.out.println("Exception in Chargers" + exception);
		}
		return modelObject;
	}

	@PostMapping("/view-cover")
	public ModelAndView cover() {
		ModelAndView modelObject = new ModelAndView("accessview");
		try {
			String itemdesc = "mobilecover";
			List<Item> item = (List<Item>) itemRepository.findByItemtype(itemdesc);

			modelObject.addObject("list", item);
		} catch (Exception exception) {
			System.out.println("Exception in Mobile covers" + exception);
		}
		return modelObject;
	}

	@PostMapping("/view-screen")
	public ModelAndView screen() {
		ModelAndView modelObject = new ModelAndView("accessview");
		try {
			String itemdesc = "mobilescreen";
			List<Item> item = (List<Item>) itemRepository.findByItemtype(itemdesc);

			modelObject.addObject("list", item);
		} catch (Exception exception) {
			System.out.println("Exception in Mobile Screens" + exception);
		}
		return modelObject;
	}

	@PostMapping("/view-usb")
	public ModelAndView usb() {
		ModelAndView modelObject = new ModelAndView("accessview");
		try {
			String itemdesc = "usb";
			List<Item> item = (List<Item>) itemRepository.findByItemtype(itemdesc);

			modelObject.addObject("list", item);
		} catch (Exception exception) {
			System.out.println("Exception in USB" + exception);
		}
		return modelObject;
	}

	@PostMapping("/apple")
	public ModelAndView apple() {
		ModelAndView modelObject = new ModelAndView("accessview");
		try {
			String itemdesc = "applemobile";
			List<Item> item = (List<Item>) itemRepository.findByItemtype(itemdesc);

			modelObject.addObject("list", item);
		} catch (Exception exception) {
			System.out.println("Exception in Apple phone" + exception);
		}
		return modelObject;
	}

	@PostMapping("/vivo")
	public ModelAndView vivo() {
		ModelAndView modelObject = new ModelAndView("accessview");
		try {
			String itemdesc = "vivomobile";
			List<Item> item = (List<Item>) itemRepository.findByItemtype(itemdesc);

			modelObject.addObject("list", item);
		} catch (Exception exception) {
			System.out.println("Exception in Vivo Phone" + exception);
		}
		return modelObject;
	}

	@PostMapping("/realme")

	public ModelAndView realme() {
		ModelAndView modelObject = new ModelAndView("accessview");
		try {
			String itemdesc = "realmemobile";
			List<Item> item = (List<Item>) itemRepository.findByItemtype(itemdesc);

			modelObject.addObject("list", item);
		} catch (Exception exception) {
			System.out.println("Exception in RealMe Phone" + exception);
		}
		return modelObject;
	}

	@PostMapping("/oneplus")
	public ModelAndView oneplus() {
		ModelAndView modelObject = new ModelAndView("accessview");
		try {
			String itemdesc = "oneplusmobile";

			List<Item> item = (List<Item>) itemRepository.findByItemtype(itemdesc);

			modelObject.addObject("list", item);
		} catch (Exception exception) {
			System.out.println("Exception in One Plus Phone" + exception);
		}
		return modelObject;
	}

	@PostMapping("/samsung")
	public ModelAndView samsung() {
		ModelAndView modelObject = new ModelAndView("accessview");
		try {
			String itemdesc = "samsungmobile";
			List<Item> item = (List<Item>) itemRepository.findByItemtype(itemdesc);

			modelObject.addObject("list", item);
		} catch (Exception exception) {
			System.out.println("Exception in Samsung Phone" + exception);
		}
		return modelObject;
	}

	@PostMapping("/mi")
	public ModelAndView mi() {
		ModelAndView modelObject = new ModelAndView("accessview");
		try {
			String itemdesc = "redmimobile";
			List<Item> item = (List<Item>) itemRepository.findByItemtype(itemdesc);

			modelObject.addObject("list", item);
		} catch (Exception exception) {
			System.out.println("Exception in MI Phone" + exception);
		}
		return modelObject;
	}

}
