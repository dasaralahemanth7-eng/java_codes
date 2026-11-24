public static void main(String[] args) {        
        int[] a = {1, 2, 2, 3, 4};  
         int[] b = {2, 2, 4, 5}; 
        HashSet<Integer> intersection = new HashSet<>();
        for (int num : a) intersection.add(num);
        HashSet<Integer> result = new HashSet<>();
        for (int num : b) {
            if(intersection.contains(num)) {
                result.add(num);
                     
            }        
        }     
             
         System.out.println(result);
    }
