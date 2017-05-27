package com.io;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Customer implements Serializable {
String name;
transient int id;
public Customer(){
	
}
public Customer(int i){
    this.id=id;	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
	System.out.println("inside set name.....");
}
public void writeexternal(ObjectOutput out) throws IOException{
  System.out.println("Write external....");
out.write(id);
}
public void readExternal(ObjectInput in )throws IOException,ClassNotFoundException{
	System.out.println("read external.....");
	id=in.read();
}
}