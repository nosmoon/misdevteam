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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1460_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public int thmmsendqty;
	public int thmmvalqty;
	public int aftcnt;
	public int real_qty;

	public SE_BOI_1460_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setThmmsendqty(int thmmsendqty){
		this.thmmsendqty = thmmsendqty;
	}

	public void setThmmvalqty(int thmmvalqty){
		this.thmmvalqty = thmmvalqty;
	}

	public void setAftcnt(int aftcnt){
		this.aftcnt = aftcnt;
	}

	public void setReal_qty(int real_qty){
		this.real_qty = real_qty;
	}

	public String getYymm(){
		return this.yymm;
	}

	public int getThmmsendqty(){
		return this.thmmsendqty;
	}

	public int getThmmvalqty(){
		return this.thmmvalqty;
	}

	public int getAftcnt(){
		return this.aftcnt;
	}

	public int getReal_qty(){
		return this.real_qty;
	}
}

/* �ۼ��ð� : Wed Feb 04 21:25:55 KST 2009 */