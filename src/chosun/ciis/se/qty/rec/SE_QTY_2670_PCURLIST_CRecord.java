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


public class SE_QTY_2670_PCURLIST_CRecord extends java.lang.Object implements java.io.Serializable{

	public String a_prt_plac_cd;
	public String a_prt_plac_nm;
	public String a_pcnt;
	public String a_qty;
	public String b_route_prt_plac_cd;
	public String b_route_prt_plac_nm;
	public String b_qty;

	public SE_QTY_2670_PCURLIST_CRecord(){}

	public void setA_prt_plac_cd(String a_prt_plac_cd){
		this.a_prt_plac_cd = a_prt_plac_cd;
	}

	public void setA_prt_plac_nm(String a_prt_plac_nm){
		this.a_prt_plac_nm = a_prt_plac_nm;
	}

	public void setA_pcnt(String a_pcnt){
		this.a_pcnt = a_pcnt;
	}

	public void setA_qty(String a_qty){
		this.a_qty = a_qty;
	}

	public void setB_route_prt_plac_cd(String b_route_prt_plac_cd){
		this.b_route_prt_plac_cd = b_route_prt_plac_cd;
	}

	public void setB_route_prt_plac_nm(String b_route_prt_plac_nm){
		this.b_route_prt_plac_nm = b_route_prt_plac_nm;
	}

	public void setB_qty(String b_qty){
		this.b_qty = b_qty;
	}

	public String getA_prt_plac_cd(){
		return this.a_prt_plac_cd;
	}

	public String getA_prt_plac_nm(){
		return this.a_prt_plac_nm;
	}

	public String getA_pcnt(){
		return this.a_pcnt;
	}

	public String getA_qty(){
		return this.a_qty;
	}

	public String getB_route_prt_plac_cd(){
		return this.b_route_prt_plac_cd;
	}

	public String getB_route_prt_plac_nm(){
		return this.b_route_prt_plac_nm;
	}

	public String getB_qty(){
		return this.b_qty;
	}
}

/* 작성시간 : Tue Jun 16 10:15:53 KST 2009 */