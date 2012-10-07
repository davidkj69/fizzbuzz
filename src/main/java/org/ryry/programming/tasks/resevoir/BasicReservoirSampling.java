package org.ryry.programming.tasks.resevoir;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

public class BasicReservoirSampling {

	public static void reservoir(String filename,String[] list){
		
		try{
			File f=new File(filename);
			
			try{BufferedReader b=new BufferedReader(new FileReader(f));
			String l; 
			int c=0,r; 
			Random g=new Random();
			while( (l=b.readLine())!=null ) {
				
				if( c<list.length ) 
					r=c++; 
				else 
					r=g.nextInt(++c);
				
				if( r<list.length ) 
					list[r]=l;
			}
			
			b.close();
			
			} catch (Exception e) {
				
			}
			
		} catch (Exception e) {
			
		}
		
	}
}
