class Solution {
        public long countCommas(long n) {
                    long total = 0;
                            long low = 1;
                                    for (int d = 1; d <= 16; d++) {
                                                    if (low > n) break;
                                                                long high = Math.min(low * 10 - 1, n);
                                                                            total += (high - low + 1) * ((d - 1) / 3);
                                                                                        low *= 10;
                                    }
                                            return total;
        }
}
                                    
