package puzzles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LargeResponses {
	static void largeResponses(String filename) {
		filename= filename.concat(".txt");
		String newFileName= "bytes_"+filename;
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		long totalBytes=0;
		int records=0;
		int bytes;
//		int lastSpaceIndex;
//		String bytes;
		try {
			System.out.println("hello1");
			fr = new FileReader(filename);
			br =new BufferedReader(fr);
			String currentLine;
			while((currentLine=br.readLine())!=null) {
				String [] recordInfo=currentLine.split("(?=\\d*$)", 2);
				bytes = Integer.parseInt(recordInfo[1]);
				System.out.println(bytes);
				if(bytes > 5000) {
					totalBytes+=bytes;
					records++;
				}
//				currentLine = currentLine.trim();
//				lastSpaceIndex = currentLine.lastIndexOf(" ");
//				bytes =currentLine.substring(lastSpaceIndex+1, currentLine.length());
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(br != null)
					br.close();
				if(fr!=null)
					fr.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("total records"+records);
		System.out.println("total bytes"+totalBytes);
			try {
				fw = new FileWriter(newFileName);
				bw = new BufferedWriter(fw);
				String content = records+"\n"+totalBytes;
				System.out.println(content);
				bw.write(content);
				bw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	public static void main(String s[]) {
		
	}

}
