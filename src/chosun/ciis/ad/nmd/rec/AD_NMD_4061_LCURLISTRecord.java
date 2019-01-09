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


package chosun.ciis.ad.nmd.rec;

import java.sql.*;
import chosun.ciis.ad.nmd.dm.*;
import chosun.ciis.ad.nmd.ds.*;

/**
 * 
 */


public class AD_NMD_4061_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String dlco_nm;
	public String make_dt;
	public int stplt_time;
	public int dd;
	public int cnt;
	public int sale_amt;
	public int sub_amt;
	public int lftvr_amt;

	public AD_NMD_4061_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setStplt_time(int stplt_time){
		this.stplt_time = stplt_time;
	}

	public void setDd(int dd){
		this.dd = dd;
	}

	public void setCnt(int cnt){
		this.cnt = cnt;
	}

	public void setSale_amt(int sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setSub_amt(int sub_amt){
		this.sub_amt = sub_amt;
	}

	public void setLftvr_amt(int lftvr_amt){
		this.lftvr_amt = lftvr_amt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public int getStplt_time(){
		return this.stplt_time;
	}

	public int getDd(){
		return this.dd;
	}

	public int getCnt(){
		return this.cnt;
	}

	public int getSale_amt(){
		return this.sale_amt;
	}

	public int getSub_amt(){
		return this.sub_amt;
	}

	public int getLftvr_amt(){
		return this.lftvr_amt;
	}
}

/* 작성시간 : Fri May 02 13:06:52 KST 2014 */