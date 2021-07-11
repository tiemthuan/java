/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llpkg;
import java.lang.Comparable;
public class LL_Element {
Comparable data;
LL_Element next;
LL_Element previous;

public LL_Element(Comparable data){
    this.data = data;
    next=previous=null;
}
public Comparable getData(){
    return data;
}
public void setData(Comparable data){
    this.data=data;
}
public LL_Element getNext(){
    return this.next;
}
public void setNext(LL_Element next){
    this.next=next;
}
public LL_Element getPrevious(){
    return this.previous;
}
public void setPrevious(LL_Element prvious){
    this.previous=previous;
}
@Override
public String toString(){
return data.toString();
}
}

        
         

