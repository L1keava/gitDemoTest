public class answer9 {
    public static void main (String[] args){
        // 已知圆柱体的半径为4，高为3，计算圆柱体的体积。
        int radius = 4,height = 3;
        double bottomArea,volume;
        bottomArea = Math.PI * radius * radius;
        volume  = bottomArea *height;
        System.out.println("圆柱体的体积是："+volume);
    }
}
