class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        int left = 0, right = people.length-1;
        Arrays.sort(people);
        while(left <= right) {
            int x = people[left] + people[right];
            if(x <= limit) {
                left++;
            }
            right--;
            count++;
        }
        return count;
    }
}