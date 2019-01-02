
//enum for the diffren salary grades of employees in the state
public enum SalaryGrade {
	G1(30083),
	G2(31299),
	G3(32826),
	G4(34355),
	G5(35995),
	G6(37891),
	G7(39941),
	G8(42051),
	G9(44311),
	G10(46772),
	G11(49417),
	G12(52039),
	G13(55008),
	G14(58028),
	G15(61229),
	G16(64557),
	G17(68192),
	G18(71980),
	G19(75785),
	G20(79577),
	G21(83752),
	G22(88124),
	G23(92693),
	G24(97448),
	G25(102661);
	
	
	private int salary;//salary amount
	
	SalaryGrade(int salary){
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
}
