package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DataReader {

	public static void main(String[] args) throws IOException {

		String textFile = "C:\\Users\\sujon\\IdeaProjects\\MidtermJuly2017\\src\\data\\self-driving-car";

		BufferedReader br = new BufferedReader(new FileReader(textFile));


		String text = "";
		while ((text= br.readLine())!=null){
			System.out.println(text);
		}

		br.close();
	}
}




