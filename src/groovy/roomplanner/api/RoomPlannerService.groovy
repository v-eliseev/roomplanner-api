package roomplaner.api

/**
	Remote interface definition
*/
interface RoomPlannerService {

    Plan doPlan(
		List<Room> rooms, 
		List<RoomCategory> roomCategories, 
		List<Reservation> reservations, 
		List<RoomAssignment> roomAssignments
		)
	
}