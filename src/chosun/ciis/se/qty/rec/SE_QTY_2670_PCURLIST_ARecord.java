/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_2670_PCURLIST_ARecord extends java.lang.Object implements java.io.Serializable{

	public String prt_plac_cd;
	public String prt_plac_nm;
	public String a_ledt_ecnt_cd;
	public String a_qty;
	public String b_ledt_ecnt_cd;
	public String b_qty;

	public SE_QTY_2670_PCURLIST_ARecord(){}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setPrt_plac_nm(String prt_plac_nm){
		this.prt_plac_nm = prt_plac_nm;
	}

	public void setA_ledt_ecnt_cd(String a_ledt_ecnt_cd){
		this.a_ledt_ecnt_cd = a_ledt_ecnt_cd;
	}

	public void setA_qty(String a_qty){
		this.a_qty = a_qty;
	}

	public void setB_ledt_ecnt_cd(String b_ledt_ecnt_cd){
		this.b_ledt_ecnt_cd = b_ledt_ecnt_cd;
	}

	public void setB_qty(String b_qty){
		this.b_qty = b_qty;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getPrt_plac_nm(){
		return this.prt_plac_nm;
	}

	public String getA_ledt_ecnt_cd(){
		return this.a_ledt_ecnt_cd;
	}

	public String getA_qty(){
		return this.a_qty;
	}

	public String getB_ledt_ecnt_cd(){
		return this.b_ledt_ecnt_cd;
	}

	public String getB_qty(){
		return this.b_qty;
	}
}

/* �ۼ��ð� : Tue Jun 16 10:15:53 KST 2009 */