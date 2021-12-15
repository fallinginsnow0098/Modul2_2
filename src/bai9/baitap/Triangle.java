package bai9.baitap;

public class Triangle {
    public static String isTriangle(int canhA, int canhB, int canhC){
        boolean isNotTriangle = canhA <= 0 || canhB <= 0 || canhC <= 0 || canhA + canhB <= canhC || canhA + canhC <= canhB || canhB + canhC <= canhA;
        if (isNotTriangle){
            return "Không phải là tam giác";
        } else if (canhA == canhC && canhB == canhC){
            return "Tam giác đều";
        } else if (canhA == canhB || canhA == canhC || canhB == canhC){
            return "Tam giác cân";
        } else {
            return "Tam giác thường";
        }
    }
}
