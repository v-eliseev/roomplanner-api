package roomplanner.api

/**
	Remote interface definition
*/
interface IRoomPlannerService {

    Plan doPlan(
		List<Room> rooms, 
		List<RoomCategory> roomCategories, 
		List<Reservation> reservations, 
		List<RoomAssignment> roomAssignments
		)
	
}