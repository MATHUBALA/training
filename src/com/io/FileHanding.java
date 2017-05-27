package com.io;

import java.io.File;
import java.io.FilenameFilter;

public class FileHanding {
    public static void main(String[] args) {
		try{
			File file=new File("F:\\Studies\\wipro\\Milestone 1\\TM01");
            System.out.println(file.isDirectory());
            String str[]=file.list();
            for (String name : str) {
				System.out.println(name);
			}
            String filespdf[]=file.list(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					if(name.endsWith(".pdf")){
						return true;
					}else{
						return false;
					}
				}
			});
            System.out.println("=----------");
            for(String name: filespdf){
            	System.out.println(name);
            }
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
