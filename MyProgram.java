public class MyProgram
{
    public static String classifyMovie(double averageRating, int reviewCount) {
        if (reviewCount < 50) {
            return "Not enough data";
        }
        else if(averageRating < 5.0) {
            return "Poor";
        }
        else if(averageRating >= 5.0 && averageRating < 7.5) {
            return "Average";
        }
        else {
            return "Excellent";
        }
    }
    public static void main(String[] args)
    {
        // MyProgram r = new MyProgram();
        // System.out.print(r.classifyMovie(5,70));
        System.out.print(classifyMovie(5,70));
    }
}
