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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6058_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chk;
	public String brnm1;
	public String brcd;
	public String brnm;
	public String a_total;
	public String b_total;
	public String biyul;
	public String camt;

	public MC_BUDG_6058_LCURLISTRecord(){}

	public void setChk(String chk){
		this.chk = chk;
	}

	public void setBrnm1(String brnm1){
		this.brnm1 = brnm1;
	}

	public void setBrcd(String brcd){
		this.brcd = brcd;
	}

	public void setBrnm(String brnm){
		this.brnm = brnm;
	}

	public void setA_total(String a_total){
		this.a_total = a_total;
	}

	public void setB_total(String b_total){
		this.b_total = b_total;
	}

	public void setBiyul(String biyul){
		this.biyul = biyul;
	}

	public void setCamt(String camt){
		this.camt = camt;
	}

	public String getChk(){
		return this.chk;
	}

	public String getBrnm1(){
		return this.brnm1;
	}

	public String getBrcd(){
		return this.brcd;
	}

	public String getBrnm(){
		return this.brnm;
	}

	public String getA_total(){
		return this.a_total;
	}

	public String getB_total(){
		return this.b_total;
	}

	public String getBiyul(){
		return this.biyul;
	}

	public String getCamt(){
		return this.camt;
	}
}

/* �ۼ��ð� : Tue May 12 16:18:06 KST 2009 */