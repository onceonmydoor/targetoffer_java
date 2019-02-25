public class Test03 {
    public static boolean  find(int[][] matrix,int num){
        //boolean result = false;
        if(matrix==null)
            return false;
        int rows = matrix.length;//数组行
        int cols = matrix[0].length;//数组列
        int row = 0;//行索引
        int col = cols-1;//列索引

        while(row>=0&&row<rows&&col>0&&col<cols) {
            if (matrix[row][col] == num) {//核心思想，判断右上角的数是否是要寻找的数
                return true;
            }
            if (matrix[row][col] > num) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        System.out.println(find(matrix, 7));    // 要查找的数在数组中
        System.out.println(find(matrix, 5));    // 要查找的数不在数组中
        System.out.println(find(matrix, 1));    // 要查找的数是数组中最小的数字
        System.out.println(find(matrix, 15));   // 要查找的数是数组中最大的数字
        System.out.println(find(matrix, 0));    // 要查找的数比数组中最小的数字还小
        System.out.println(find(matrix, 16));   // 要查找的数比数组中最大的数字还大
        System.out.println(find(null, 16));     // 健壮性测试，输入空指针
    }

}
