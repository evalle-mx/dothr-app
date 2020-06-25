package net.dothr.app.business.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import net.dothr.app.business.dto.RoomDto;
import net.dothr.app.data.entity.Room;
import net.dothr.app.data.repository.RoomRep;

@Service
public class RoomService {
	
	private RoomRep roomRep;
	private RoomDto roomDto;
	
	@Autowired
	public RoomService(RoomRep roomRep) {
		this.roomRep=roomRep;
	}
	
	
	public List<RoomDto> getRoomsByName(String name){
		System.out.println("<getRoomsByName>");
		
		if(null==name || name.length()<1) {
			name="Manchester";
		}
		System.out.println("name: " + name);
		Iterable<Room> rooms = this.roomRep.findReservationByName(name);
		List<RoomDto> lsRoom = new ArrayList<RoomDto>();
		
		rooms.forEach( room -> {
			roomDto = new RoomDto();
			roomDto.setRoomName(room.getName());
			roomDto.setRoomId(room.getRoomId());
			roomDto.setRoomNumber( room.getRoomNumber() );
			roomDto.setBedInfo( room.getBedInfo() );
			System.out.println("roomDto: " + roomDto.getRoomId() + ", " + roomDto.getRoomName() + ", " + roomDto.getRoomNumber() + ", "+ roomDto.getBedInfo());
			lsRoom.add(roomDto);
		});
		return lsRoom;
	}

}
