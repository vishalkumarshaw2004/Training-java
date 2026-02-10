package PolicyManagement;

public class InsurancePolicy {
	 private Integer policyNumber;     
	    private String customerName;      
	    private String policyType;          
	    private Integer customerAge;       
	    private Double basePremium;        
	    private String policyStatus;
		public Integer getPolicyNumber() {
			return policyNumber;
		}
		public String getCustomerName() {
			return customerName;
		}
		public String getPolicyType() {
			return policyType;
		}
		public Integer getCustomerAge() {
			return customerAge;
		}
		public Double getBasePremium() {
			return basePremium;
		}
		public String getPolicyStatus() {
			return policyStatus;
		}
		public InsurancePolicy(Integer policyNumber, String customerName, String policyType, Integer customerAge,
				Double basePremium, String policyStatus) {
			super();
			this.policyNumber = policyNumber;
			this.customerName = customerName;
			this.policyType = policyType;
			this.customerAge = customerAge;
			this.basePremium = basePremium;
			this.policyStatus = policyStatus;
		}
		
		@Override
		public String toString() {
			return "InsurancePolicy [policyNumber=" + policyNumber + ", customerName=" + customerName + ", policyType="
					+ policyType + ", customerAge=" + customerAge + ", basePremium=" + basePremium + ", policyStatus="
					+ policyStatus + "]";
		} 
	    
}
