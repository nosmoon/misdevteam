/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_8006_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String roll_a;
	public String roll_c;
	public String roll_b;

	public MT_PAPORD_8006_LCURLISTRecord(){}

	public void setRoll_a(String roll_a){
		this.roll_a = roll_a;
	}

	public void setRoll_c(String roll_c){
		this.roll_c = roll_c;
	}

	public void setRoll_b(String roll_b){
		this.roll_b = roll_b;
	}

	public String getRoll_a(){
		return this.roll_a;
	}

	public String getRoll_c(){
		return this.roll_c;
	}

	public String getRoll_b(){
		return this.roll_b;
	}
}

/* �ۼ��ð� : Fri Oct 28 16:14:10 KST 2016 */