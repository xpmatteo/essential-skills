package esad.chapter01.exercise02.solved;



class OrganizationsInDb {
	private final DbService dbService;

	OrganizationsInDb(DbService service) {
		this.dbService = service;
	}

	void addOrganization(Organization o) {
		dbService.executeStatement("INSERT INTO organizations VALUES (?,?,?,?,?,?,?,?,?,?,)",
				o.getId(),
				o.getEName(),
				o.getCName() 
				// ...
				);
	}
}
