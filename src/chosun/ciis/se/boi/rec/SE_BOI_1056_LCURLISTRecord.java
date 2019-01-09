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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1056_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String vexc_mang_pers;
	public String empno;
	public String nm;
	public String offi_real_hdqtboks_nm;
	public String boks_team_nm;
	public String part_nm;
	public String remk;

	public SE_BOI_1056_LCURLISTRecord(){}

	public void setVexc_mang_pers(String vexc_mang_pers){
		this.vexc_mang_pers = vexc_mang_pers;
	}

	public void setEmpno(String empno){
		this.empno = empno;
	}

	public void setNm(String nm){
		this.nm = nm;
	}

	public void setOffi_real_hdqtboks_nm(String offi_real_hdqtboks_nm){
		this.offi_real_hdqtboks_nm = offi_real_hdqtboks_nm;
	}

	public void setBoks_team_nm(String boks_team_nm){
		this.boks_team_nm = boks_team_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getVexc_mang_pers(){
		return this.vexc_mang_pers;
	}

	public String getEmpno(){
		return this.empno;
	}

	public String getNm(){
		return this.nm;
	}

	public String getOffi_real_hdqtboks_nm(){
		return this.offi_real_hdqtboks_nm;
	}

	public String getBoks_team_nm(){
		return this.boks_team_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Tue Mar 24 16:17:36 KST 2009 */