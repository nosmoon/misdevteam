/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_3000_ACURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String num;
	public String monday;
	public String sunday;

	public HD_VACA_3000_ACURLISTRecord(){}

	public void setNum(String num){
		this.num = num;
	}

	public void setMonday(String monday){
		this.monday = monday;
	}

	public void setSunday(String sunday){
		this.sunday = sunday;
	}

	public String getNum(){
		return this.num;
	}

	public String getMonday(){
		return this.monday;
	}

	public String getSunday(){
		return this.sunday;
	}
}

/* �ۼ��ð� : Fri Mar 11 15:46:48 KST 2016 */