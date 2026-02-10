package PolicyManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PolicyService {
	private List<InsurancePolicy> policyList = new ArrayList<>();
	private Map<Integer, InsurancePolicy> policyMap = new HashMap<>();

	public void addPolicy(InsurancePolicy policy) {
		if (policyMap.containsKey(policy.getPolicyNumber())) {
			System.out.println("Policy already exists");
			return;
		}
		policyList.add(policy);
		policyMap.put(policy.getPolicyNumber(), policy);

	}

	public void removeExpiredPolicies() {
		 Iterator<InsurancePolicy> it = policyList.iterator();
	        while (it.hasNext()) {
	            InsurancePolicy p = it.next();
	            if (p.getPolicyStatus().equals("EXPIRED")) {
	                policyMap.remove(p.getPolicyNumber());
	                it.remove();
	            }
	        }
	        System.out.println("Expired policies removed");
	}

	public void groupPolicyCount() {
	    Map<String, Integer> countMap = new HashMap<>();

	    for (InsurancePolicy p : policyList) {
	        countMap.put(
	            p.getPolicyType(),
	            countMap.getOrDefault(p.getPolicyType(), 0) + 1
	        );
	    }

	    for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
	        String key = entry.getKey();
	        Integer value = entry.getValue();

	        System.out.println(key + " -> " + value);
	    }

		
	}

	public void highestPremiumPolicy() {
		 InsurancePolicy max = null;
	        for (InsurancePolicy p : policyList) {
	            if (max == null || p.getBasePremium() > max.getBasePremium()) {
	                max = p;
	            }
	        }
	        System.out.println(max);
	}

	public void displayActivePolicies() {

		for (InsurancePolicy p : policyList) {
			if (p.getPolicyStatus().equals("ACTIVE")) {
				System.out.println(p);
			}
		}
	}

	public double calculatePremium(String type, double base) {

		return switch (type) {
		case "HEALTH" -> base + base * 0.20;
		case "LIFE" -> base + base * 0.35;
		case "VEHICLE" -> base + base * 0.15;
		case "TRAVEL" -> base + base * 0.10;

		default -> base;
		};
	}

	public void validatePolicyType(String type) throws InvalidPolicyTypeException {
		if (!type.equals("HEALTH") && !type.equals("LIFE") && !type.equals("VEHICLE") && !type.equals("TRAVEL")) {
			throw new InvalidPolicyTypeException("Invalid Policy Type");
		}

	}

}
