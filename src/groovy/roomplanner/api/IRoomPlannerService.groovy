package roomplanner.api

/**
	Remote interface definition
*/
interface IRoomPlannerService {

    def doPlan(
    	def license,
		def rooms, 
		def roomCategories, 
		def reservations, 
		def roomAssignments,
		def pricelist
		)
	
}