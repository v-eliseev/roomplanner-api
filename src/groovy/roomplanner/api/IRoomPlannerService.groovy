package roomplanner.api

/**
	Remote interface definition
*/
interface IRoomPlannerService {

    def doPlan(
		def rooms, 
		def roomCategories, 
		def reservations, 
		def roomAssignments
		)
	
}