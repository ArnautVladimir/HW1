package HomeWork2;

public enum Size {
	
	XXS(32) {
		@Override
		public String getDescription() {
			return "Евроразмер 32";
		}
	},
	
	XS(34) {
		@Override
		public String getDescription() {
			return "Евроразмер 34";
		}
	}, 
	
	S(36) {
		@Override
		public String getDescription() {
			return "Евроразмер 36";
		}
	}, 
	
	M(38) {
		@Override
		public String getDescription() {
			return "Евроразмер 38";
		}
	}, 
	
	L(40) {
		@Override
		public String getDescription() {
			return "Евроразмер 40";
		}
	};
	
	private int euroSize;

	private Size(int euroSize) {
		this.setEuroSize(euroSize);
	}
	
	public abstract String getDescription();

	public int getEuroSize() {
		return euroSize;
	}

	public void setEuroSize(int euroSize) {
		this.euroSize = euroSize;
	}


}
