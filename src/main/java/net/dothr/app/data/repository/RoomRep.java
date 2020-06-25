package net.dothr.app.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.dothr.app.data.entity.Room;

@Repository
public interface RoomRep extends CrudRepository<Room, Long>{

	/* Method which infers by attribute */
	Iterable<Room> findReservationByName(String name);
	
}
