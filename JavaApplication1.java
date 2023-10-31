
package zuvio_hw;

public class JavaApplication1 {

// main程序

    public static void main(String[] args) {
        // 創建CTriangle對象，a=3, b=4, c=5，颜色為紅色
        CTriangle triangle = new CTriangle("紅色", 3, 4, 5);

        // 計算並輸出面積
        double area = triangle.calculateArea();
        System.out.println("直角三角形的面積為: " + area);
        System.out.println("顏色為: " + triangle.getColor());
    
}
    
}
class CShape {
    private String color;

    public CShape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double calculateArea() {
        return 0; //默認面積為0，在子類別中進行重寫
    }
}
// 定義CTriangle子類別
class CTriangle extends CShape {
    private double a;
    private double b;
    private double c;

    public CTriangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        // 計算直角三角形的面積：0.5 * 底邊a * 高度b
        return 0.5 * a * b;
    }
}
