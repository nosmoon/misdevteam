/***************************************************************************************************
* 파일명 : .java
* 기능 : 자재 - 마감관리 - 제작비
* 작성일자 : 2010-05-18
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.close.rec;

import java.sql.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */


public class MT_CLOSE_6010_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String gubun;
	public String title;
	public String pre_year;
	public String pre_month;
	public String cur_month;
	public String remk;
	public String base_yymm;
	public String fac_clsf;
	public String seq;

	public MT_CLOSE_6010_LCURLIST2Record(){}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setPre_year(String pre_year){
		this.pre_year = pre_year;
	}

	public void setPre_month(String pre_month){
		this.pre_month = pre_month;
	}

	public void setCur_month(String cur_month){
		this.cur_month = cur_month;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setBase_yymm(String base_yymm){
		this.base_yymm = base_yymm;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getTitle(){
		return this.title;
	}

	public String getPre_year(){
		return this.pre_year;
	}

	public String getPre_month(){
		return this.pre_month;
	}

	public String getCur_month(){
		return this.cur_month;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getBase_yymm(){
		return this.base_yymm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Tue May 18 09:49:05 KST 2010 */