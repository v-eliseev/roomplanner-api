package roomplaner

import roomplanner.Room
import roomplanner.RoomCategory
import roomplanner.Reservation
import roomplanner.RoomAssignment
import roomplanner.Plan

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