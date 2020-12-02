package by.matmux.bean;

public enum VoucherEnum {
	TOURISTVOUCHERS("touristVouchers"),
	TOURISTVOUCHER("touristVoucher"),
	COUNTRY("country"),
	NAME("name"),
	RAILWAYCAR("railwayCar"),
	TYPEROOM("typeRoom"),
	PERSONS("persons"),
	DATE("date"),
	DAYS("days"),
	COST("cost"),
	BRAND("brand"),
	YEAROFMANUFACTURE("yearOfManufacture"),
	SEAT("seat"),
	AIRLINES("airlines"),
	RATING("rating"),
	MEALS("meals"),
	TV("TV"),
	CONDITIONER("conditioner");
	
	private String value;
	
	public String getValue() {
		return value;
	}

	private VoucherEnum(final String value) {
		this.value = value;
	}
}
