/***************************************************************************************************
* ���ϸ� : SS_S_BOINFOCURCOMMLIST3Record.java
* ��� : ����Info-������Ȳ-��-���븦 ���� Record
* �ۼ����� : 2004-03-10
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * ����Info-������Ȳ-��-���븦 ���� Record
 */

public class SS_S_BOINFOCURCOMMLIST3Record extends java.lang.Object implements java.io.Serializable{

	public int cho_amt;
	public int boy_amt;
	public int wee_amt;
	public int sch_amt;
	public int tot_amt;

	public SS_S_BOINFOCURCOMMLIST3Record(){}

	public void setCho_amt(int cho_amt){
		this.cho_amt = cho_amt;
	}

	public void setBoy_amt(int boy_amt){
		this.boy_amt = boy_amt;
	}

	public void setWee_amt(int wee_amt){
		this.wee_amt = wee_amt;
	}

	public void setSch_amt(int sch_amt){
		this.sch_amt = sch_amt;
	}

	public void setTot_amt(int tot_amt){
		this.tot_amt = tot_amt;
	}

	public int getCho_amt(){
		return this.cho_amt;
	}

	public int getBoy_amt(){
		return this.boy_amt;
	}

	public int getWee_amt(){
		return this.wee_amt;
	}

	public int getSch_amt(){
		return this.sch_amt;
	}

	public int getTot_amt(){
		return this.tot_amt;
	}
}

/* �ۼ��ð� : Wed May 12 19:51:04 KST 2004 */