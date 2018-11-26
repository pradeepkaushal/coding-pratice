package practice.algorithm;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MatrixTravesal {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int matrixRows = Integer.parseInt(bufferedReader.readLine().trim());
        int matrixColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> matrix = new ArrayList<>();

        IntStream.range(0, matrixRows).forEach(i -> {
            try {
                matrix.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        String target_string = bufferedReader.readLine();

        String res = find_path(matrix, target_string);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    // Complete the find_path function below.
    static String find_path(List<List<String>> matrix, String target_string) {
        int m=matrix.size();
        int n=matrix.get(0).size();
        String[][] mat = new String[m][n];
        
        for(int i=0;i<m;i++){
            List<String> strings = matrix.get(0);
            for(int j=0;j<n;j++ ){
                mat[i][n]=strings.get(j);
            }
        }
        for(int i=0;i<target_string.length();i++){
            
        }



        return "NO";
    }

    private static String findMovement(String[][] mat, int i, int j, String target,int m,int n){
        //Move right AND down
        if(!canMove(m,n,i,j+1)||!(canMove(m,n,i+1,j))){
            return "NO";
        }
        if(mat[i+1][j].equals(target)){
            return "D";
        }
        if(mat[i][j+1].equals(target)){
            return "R";
        }
        return "NO";
    }
    private static boolean canMove(int m,int n, int i, int j){
        if(!(i<m)||!(i+1<m)){
            return false;
        }
        if(!(j<n)||!(j+1<n)){
            return false;
        }
        return true;

    }
}
