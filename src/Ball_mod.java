import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Ball_mod {
    private static DecimalFormat df2 = new DecimalFormat("#####");

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Boolean incorrect = true;
//        // r
//        while (incorrect) {
//            incorrect = false;
//            System.out.print("r = ");
//            try {
//                Integer r = Integer.parseInt(br.readLine());
//            } catch (NumberFormatException nfe) {
//                incorrect = true;
//                System.out.println("Invalid Format! Number expected.");
//                continue;
//            }
//        }
        System.out.print("r = ");
        Double r = Double.parseDouble(br.readLine());

        System.out.print("x = ");
        Double x = Double.parseDouble(br.readLine());

        System.out.print("y = ");
        Double y = Double.parseDouble(br.readLine());

        System.out.print("t = ");
        Double t = Double.parseDouble(br.readLine());
        Double time = 0.0;
        int i = 0;

        System.out.print("k = ");
        Double k = Double.parseDouble(br.readLine());

        System.out.print("dx = ");
        Double dx = Double.parseDouble(br.readLine());

        System.out.print("dy = ");
        Double dy = Double.parseDouble(br.readLine());

        System.out.print("dt = ");
        Double dt = Double.parseDouble(br.readLine());

        FileWriter writer = new FileWriter("C:\\Apps\\mod1\\logs.txt", true);

        writer.append("r = " + r +", x = " + x + ", y = " + y + ", dx = " + dx + ", dy = " + dy + ", t = " + t + ", dt = "+ dt + ", k = " + k + "\n");

        while (time < t){
            writer.append("\nt" + i + ": (" + df2.format(x) + ", " + df2.format(y) + ") ->  (" + df2.format(dx) + ", " + df2.format(dy) + ")");

            time += dt;
            x += dx;
            i++;

            if (y - r - dy > 0){
                y = y - dy;
            } else {
                y = 0.0;
                dy = - dy * k;
            }

            dy = dy + dt * 10; // 9.8 ~ 10 ускорение свободного падения
            dx *=0.9;
        }
        writer.flush();
    }


}
