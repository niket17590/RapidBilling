package com.rapid.qss.lab.billing.common;

public class SharedConstants {

	private SharedConstants() {
	}

	public enum PaymentMode {
		CASH, ONLINE
	}

	public enum OrderStatus {
		NEW, PRINTED, BINDING, DELIVERED
	}

	public enum PaymentStatus {
		PENDING, COMPLETE
	}

	public enum PadType {
		HARD_PAD, LOOSE_PAD
	}

	public enum PaperType {
		REGULAR_GLOSSY("Regular Glossy"),
		REGULAR_MATT("Regular Matt"),
		NT_GLOSSY("Nt Glossy"),
		NT_MATT("Nt Matt"),
		NT_VALVET("Nt Valvet"),
		REGULAR_VALVET("Regular Valvet");

		private String paper;

		PaperType(String paper) {
			this.paper = paper;
		}

		public String valueOf() {
			return this.paper;
		}
		
	}

	public enum PaperSize {
		SIZE_4X6("4X6"),
		SIZE_5X7("5X7"),
		SIZE_6X8("6X8"),
		SIZE_6X9("6X9"),
		SIZE_8X10("8X10"),
		SIZE_8X12("8X12"),
		SIZE_12X12("12X12"),
		SIZE_12X18("12X18"),
		SIZE_12X24("12X24"),
		SIZE_12X30("12X30"),
		SIZE_12X36("12X36");

		private String size;

		PaperSize(String size) {
			this.size = size;
		}

		public String valueOf() {
			return this.size;
		}
	}
}
