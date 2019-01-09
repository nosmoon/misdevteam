/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.semuro.rec;

import java.sql.*;
import chosun.ciis.co.semuro.dm.*;
import chosun.ciis.co.semuro.ds.*;

/**
 * 
 */


public class CO_SEMURO_1700_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String item_nm;
	public String uprc;
	public String qunt;
	public String item_dt;
	public String std;
	public String item_suply_amt;
	public String item_tax_amt;
	public String item_remk;

	public CO_SEMURO_1700_LCURLIST2Record(){}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setItem_dt(String item_dt){
		this.item_dt = item_dt;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setItem_suply_amt(String item_suply_amt){
		this.item_suply_amt = item_suply_amt;
	}

	public void setItem_tax_amt(String item_tax_amt){
		this.item_tax_amt = item_tax_amt;
	}

	public void setItem_remk(String item_remk){
		this.item_remk = item_remk;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getItem_dt(){
		return this.item_dt;
	}

	public String getStd(){
		return this.std;
	}

	public String getItem_suply_amt(){
		return this.item_suply_amt;
	}

	public String getItem_tax_amt(){
		return this.item_tax_amt;
	}

	public String getItem_remk(){
		return this.item_remk;
	}
}

/* 작성시간 : Thu Apr 16 18:23:24 KST 2009 */