/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author DuongAli
 */
public class displaycbbmodel {
    public Object DisplayMember;
    public Object DisplayValue;
    
    public displaycbbmodel(Object member,Object value){
        DisplayMember = member;
        DisplayValue = value;
    }
    
    @Override
    public String toString(){
        return DisplayMember.toString();
    }
}
