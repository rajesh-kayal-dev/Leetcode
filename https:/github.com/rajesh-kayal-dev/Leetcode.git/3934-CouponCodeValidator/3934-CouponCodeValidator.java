// Last updated: 6/15/2026, 9:59:06 AM
class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<Coupon> validCoupons = new ArrayList<>();
        Set<String> validLines = Set.of("electronics", "grocery", "pharmacy", "restaurant");

        for (int i = 0; i < code.length; i++) {
            if (isActive[i] &&
                code[i] != null && !code[i].isEmpty() &&
                code[i].matches("[a-zA-Z0-9_]+") &&
                validLines.contains(businessLine[i])) {
                validCoupons.add(new Coupon(code[i], businessLine[i]));
            }
        }

        // Define the custom sort order for businessLine
        Map<String, Integer> linePriority = Map.of(
            "electronics", 1,
            "grocery", 2,
            "pharmacy", 3,
            "restaurant", 4
        );

        validCoupons.sort((a, b) -> {
            int cmp = Integer.compare(linePriority.get(a.businessLine), linePriority.get(b.businessLine));
            if (cmp == 0) {
                return a.code.compareTo(b.code);
            }
            return cmp;
        });

        // Extract only the codes from sorted coupons
        List<String> result = new ArrayList<>();
        for (Coupon c : validCoupons) {
            result.add(c.code);
        }

        return result;
    }

    class Coupon {
        String code;
        String businessLine;

        Coupon(String code, String businessLine) {
            this.code = code;
            this.businessLine = businessLine;
        }
    }
}
