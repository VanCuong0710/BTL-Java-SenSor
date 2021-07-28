/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_and_StoreSenSor;

/**
 *
 * @author 84866
 */
//SET UP NGOẠI LỆ ĐỂ THÔNG BÁO
public class Radius_Exception  extends  Exception{
    public Radius_Exception(String message) {
        super(message);
    }
// THÔNG BÁO TRÊN JFRAME
    public Radius_Exception(String message, Throwable cause) {
        super(message, cause);
    }
}
