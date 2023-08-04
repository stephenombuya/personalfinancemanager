package personalfinancemanager;

public class Transaction {

	   private int id;
	    private String date;
	    private String description;
	    private double amount;
	    private String category;

	    public Transaction(int id, String date, String description, double amount, String category) {
	        this.id = id;
	        this.date = date;
	        this.description = description;
	        this.amount = amount;
	        this.category = category;
	    }

	 // Getters and setters for all fields
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

	    // Additional methods based on your requirements
	}

