package net.dothr.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.dothr.app.data.entity.Room;
import net.dothr.app.data.repository.RoomRep;


@SpringBootApplication
public class DotHrAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DotHrAppApplication.class, args);
	}

	@RestController
	@RequestMapping("/rooms")
	public class RoomController {
		
		@Autowired
		private RoomRep roomRep;
		
		@GetMapping
		public Iterable<Room> getRooms(){
			return this.roomRep.findAll();
		}
	}
}
