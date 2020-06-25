package net.dothr.app.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.dothr.app.business.dto.RoomDto;
import net.dothr.app.business.service.RoomService;

@Controller
@RequestMapping("/viewrooms")
public class RoomsWebCtrl {
	
	private RoomService roomService;
	
	@Autowired
	public RoomsWebCtrl(RoomService roomService) {
		this.roomService=roomService;
	}
	
	@GetMapping
	public String getRooms(@RequestParam(name="nombre", required=false)String name, Model model) {
		List<RoomDto> lsRoom = this.roomService.getRoomsByName(name);
		System.out.println("lsRoom.size(): " + lsRoom.size());
		model.addAttribute("lsRoom", lsRoom);
		return "roomsView";
	}

}
