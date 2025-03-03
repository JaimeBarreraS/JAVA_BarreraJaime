package Dia9;

/**
 *
 * @author Jaime Barrera
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pipe22007
 */
public class main {
    
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top=0,bottom=matrix.length -1;
        int left=0,right=matrix[0].length -1;

        while(top<= bottom && left<=right){
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;//arriba = arriba + 1
            
            for(int i = top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left <= right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }


        }
        
       return result;
    }
    
    
}