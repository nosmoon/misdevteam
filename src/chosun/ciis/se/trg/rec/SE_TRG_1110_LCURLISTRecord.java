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


public class SE_TRG_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_cd;
	public String area_nm;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String clos_yn;
	public String thmmsendqty;
	public String prev_trgt;
	public String trgt;

	public SE_TRG_1110_LCURLISTRecord(){}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setThmmsendqty(String thmmsendqty){
		this.thmmsendqty = thmmsendqty;
	}

	public void setPrev_trgt(String prev_trgt){
		this.prev_trgt = prev_trgt;
	}

	public void setTrgt(String trgt){
		this.trgt = trgt;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getThmmsendqty(){
		return this.thmmsendqty;
	}

	public String getPrev_trgt(){
		return this.prev_trgt;
	}

	public String getTrgt(){
		return this.trgt;
	}
}

/* 작성시간 : Wed Jul 08 11:14:22 KST 2009 */