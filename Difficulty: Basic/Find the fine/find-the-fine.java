class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // code here
        int totalFine = 0;
        int n= car.length;
        
        for(int i=0;i<n;i++){
            if(date % 2 ==0){
              if(car[i] % 2 != 0){
                  totalFine+=fine[i];
              }
            }else{
                if(car[i] % 2 == 0){
                    totalFine+=fine[i];
                }
            }
        }
        return totalFine;
    }
}