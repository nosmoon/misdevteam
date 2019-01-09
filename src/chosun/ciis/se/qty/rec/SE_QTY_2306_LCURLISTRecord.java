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


public class SE_QTY_2306_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_nm;
	public String sect_nm_cd;
	public String sect_nm;
	public String pcnt;
	public String clr_pcnt;
	public String add_prt_seq;
	public String prt_plac_nm;

	public SE_QTY_2306_LCURLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_nm_cd(String sect_nm_cd){
		this.sect_nm_cd = sect_nm_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setAdd_prt_seq(String add_prt_seq){
		this.add_prt_seq = add_prt_seq;
	}

	public void setPrt_plac_nm(String prt_plac_nm){
		this.prt_plac_nm = prt_plac_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_nm_cd(){
		return this.sect_nm_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getPcnt(){
		return this.pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getAdd_prt_seq(){
		return this.add_prt_seq;
	}

	public String getPrt_plac_nm(){
		return this.prt_plac_nm;
	}
}

/* 작성시간 : Tue May 19 15:11:33 KST 2009 */