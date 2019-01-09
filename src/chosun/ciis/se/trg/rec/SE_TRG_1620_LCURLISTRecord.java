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


package chosun.ciis.se.trg.rec;

import java.sql.*;
import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.ds.*;

/**
 * 
 */


public class SE_TRG_1620_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_grp_nm;
	public String hwak_p;
	public String hwak;
	public String sil_p;
	public String sil;

	public SE_TRG_1620_LCURLISTRecord(){}

	public void setEvlu_grp_nm(String evlu_grp_nm){
		this.evlu_grp_nm = evlu_grp_nm;
	}

	public void setHwak_p(String hwak_p){
		this.hwak_p = hwak_p;
	}

	public void setHwak(String hwak){
		this.hwak = hwak;
	}

	public void setSil_p(String sil_p){
		this.sil_p = sil_p;
	}

	public void setSil(String sil){
		this.sil = sil;
	}

	public String getEvlu_grp_nm(){
		return this.evlu_grp_nm;
	}

	public String getHwak_p(){
		return this.hwak_p;
	}

	public String getHwak(){
		return this.hwak;
	}

	public String getSil_p(){
		return this.sil_p;
	}

	public String getSil(){
		return this.sil;
	}
}

/* 작성시간 : Mon Apr 06 15:30:33 KST 2009 */