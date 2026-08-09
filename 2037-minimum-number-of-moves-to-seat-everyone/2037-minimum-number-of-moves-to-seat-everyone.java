class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        for(int i=0;i<seats.length;i++){
            for(int j=i+1;j<seats.length;j++){
                if(seats[i]>seats[j]){
                    int temp=seats[i];
                    seats[i]=seats[j];
                    seats[j]=temp;
                }
            }
        }

        for(int i=0;i<students.length;i++){
            for(int j=i+1;j<students.length;j++){
                if(students[i]>students[j]){
                    int temp=students[i];
                    students[i]=students[j];
                    students[j]=temp;
                }
            }
        }

        int move=0;

        for(int i=0;i<seats.length;i++){
            if(seats[i]>students[i]){
                move+=seats[i]-students[i];
            }else{
                move+=students[i]-seats[i];
            }
        }

        return move;
    }
}