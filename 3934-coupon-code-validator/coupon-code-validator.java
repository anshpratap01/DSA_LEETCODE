class Solution {
    class Item {
        String name;
        int rank;
        
        Item(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
    }
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<Item> tempList = new ArrayList<>();
        int n = code.length;
        
        for (int i = 0; i < n; i++) {
            if (!isActive[i]) {
                continue;
            }
            
            int rank = 0;
            String line = businessLine[i];
            
            if (line.equals("electronics")) rank = 1;
            else if (line.equals("grocery")) rank = 2;
            else if (line.equals("pharmacy")) rank = 3;
            else if (line.equals("restaurant")) rank = 4;
            
            if (rank == 0) {
                continue;
            }
            
            String c = code[i];
            if (c.length() == 0) {
                continue;
            }
            
            boolean validChar = true;
            for (int j = 0; j < c.length(); j++) {
                char ch = c.charAt(j);
                if (!Character.isLetterOrDigit(ch) && ch != '_') {
                    validChar = false;
                    break;
                }
            }
            
            if (validChar) {
                tempList.add(new Item(c, rank));
            }
        }
        
        Collections.sort(tempList, (a, b) -> {
            if (a.rank != b.rank) {
                return a.rank - b.rank;
            }
            return a.name.compareTo(b.name);
        });
        
        List<String> result = new ArrayList<>();
        for (Item it : tempList) {
            result.add(it.name);
        }
        
        return result;
    }
}