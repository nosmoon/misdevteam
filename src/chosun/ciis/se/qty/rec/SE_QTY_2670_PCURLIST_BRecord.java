/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_2670_PCURLIST_BRecord extends java.lang.Object implements java.io.Serializable{

	public String real_prt_plac_cd;
	public String real_prt_plac_nm;
	public String a_pcnt;
	public String a_qty;
	public String b_pcnt;
	public String b_qty;
	public String remk;

	public SE_QTY_2670_PCURLIST_BRecord(){}

	public void setReal_prt_plac_cd(String real_prt_plac_cd){
		this.real_prt_plac_cd = real_prt_plac_cd;
	}

	public void setReal_prt_plac_nm(String real_prt_plac_nm){
		this.real_prt_plac_nm = real_prt_plac_nm;
	}

	public void setA_pcnt(String a_pcnt){
		this.a_pcnt = a_pcnt;
	}

	public void setA_qty(String a_qty){
		this.a_qty = a_qty;
	}

	public void setB_pcnt(String b_pcnt){
		this.b_pcnt = b_pcnt;
	}

	public void setB_qty(String b_qty){
		this.b_qty = b_qty;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getReal_prt_plac_cd(){
		return this.real_prt_plac_cd;
	}

	public String getReal_prt_plac_nm(){
		return this.real_prt_plac_nm;
	}

	public String getA_pcnt(){
		return this.a_pcnt;
	}

	public String getA_qty(){
		return this.a_qty;
	}

	public String getB_pcnt(){
		return this.b_pcnt;
	}

	public String getB_qty(){
		return this.b_qty;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Tue Jun 16 10:15:53 KST 2009 */