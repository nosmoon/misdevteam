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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_1130_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String roll_wgt10;
	public String roll_wgt20;
	public String roll_wgt22;
	public String roll_wgt25;
	public String roll_wgttot;

	public MT_PAPINOUT_1130_LCURLISTRecord(){}

	public void setRoll_wgt10(String roll_wgt10){
		this.roll_wgt10 = roll_wgt10;
	}

	public void setRoll_wgt20(String roll_wgt20){
		this.roll_wgt20 = roll_wgt20;
	}

	public void setRoll_wgt22(String roll_wgt22){
		this.roll_wgt22 = roll_wgt22;
	}

	public void setRoll_wgt25(String roll_wgt25){
		this.roll_wgt25 = roll_wgt25;
	}

	public void setRoll_wgttot(String roll_wgttot){
		this.roll_wgttot = roll_wgttot;
	}

	public String getRoll_wgt10(){
		return this.roll_wgt10;
	}

	public String getRoll_wgt20(){
		return this.roll_wgt20;
	}

	public String getRoll_wgt22(){
		return this.roll_wgt22;
	}

	public String getRoll_wgt25(){
		return this.roll_wgt25;
	}

	public String getRoll_wgttot(){
		return this.roll_wgttot;
	}
}

/* �ۼ��ð� : Tue Jul 31 09:28:05 KST 2012 */