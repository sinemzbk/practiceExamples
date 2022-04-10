public class GenerateParentheses {
    public static void main(String args[]){
        int r = 3;
        int c = r;
        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
               System.out.print("(");
               System.out.print(")");
            }
        }
    }
}
