class Solution {
    public int numSteps(String s) {
        int steps = 0;
        StringBuilder sb = new StringBuilder(s);

        while (!sb.toString().equals("1")) {

            
            if (sb.charAt(sb.length() - 1) == '0') {
                sb.deleteCharAt(sb.length() - 1); 
            } 
           
            else {
                int i = sb.length() - 1;

                // jab tak 0 add kro jab tak 1 hai bss index dekh lo kahi -1 m toh nhi gya
                while (i >= 0 && sb.charAt(i) == '1') {
                    sb.setCharAt(i, '0');
                    i--;
                }
                // carry bachi
                // ab bacha ki ab toh zero hi ayega 
                // jb pahela zero ayega usko usme add kr do
                if (i >= 0) {
                    sb.setCharAt(i, '1');
                } else {
                    // ya ab zero hai hi nhi toh carry ko append kr do
                    sb.insert(0, '1');
                }
            }

            steps++;
        }

        return steps;
    }
}