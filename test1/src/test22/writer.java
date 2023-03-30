package test22;
import java.io.FileWriter;
import java.io.IOException;


public class writer {



    public static void main(String[] args) {
        String data = "Hello2, world!"; // 저장할 데이터
        String filePath = "./visitor.txt"; // 저장할 파일 경로 및 이름

        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(data + "\n"); // 데이터를 파일에 쓰기
            writer.write("\n");
            writer.close(); // 파일 쓰기 종료
            System.out.println("저장 성공");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
		
}
