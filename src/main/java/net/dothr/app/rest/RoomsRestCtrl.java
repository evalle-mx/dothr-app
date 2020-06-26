package net.dothr.app.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.dothr.app.business.dto.RoomDto;
import net.dothr.app.business.service.RoomService;

@RestController
@RequestMapping("api/rooms")
public class RoomsRestCtrl {
	
	private RoomService roomService;
	
	@Autowired
	public RoomsRestCtrl(RoomService roomService) {
		this.roomService = roomService;
	}

	
	@GetMapping
	List<RoomDto> getRooms(@RequestParam(name="nombre", required = false)String nombre){
		System.out.println("<getRooms> nombre");
		return roomService.getRoomsByName(nombre);
	}
}
