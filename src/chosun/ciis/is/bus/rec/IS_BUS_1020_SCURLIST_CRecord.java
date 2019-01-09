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


package chosun.ciis.is.bus.rec;

import java.sql.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

/**
 * 
 */


public class IS_BUS_1020_SCURLIST_CRecord extends java.lang.Object implements java.io.Serializable{

	public String c_make_dtls_seq;
	public String c_dlco;
	public String c_cns_tm;
	public String c_chrg_pers;
	public String c_tel_no;
	public String c_clsf;
	public String c_vist_purp;
	public String c_remk;

	public IS_BUS_1020_SCURLIST_CRecord(){}

	public void setC_make_dtls_seq(String c_make_dtls_seq){
		this.c_make_dtls_seq = c_make_dtls_seq;
	}

	public void setC_dlco(String c_dlco){
		this.c_dlco = c_dlco;
	}

	public void setC_cns_tm(String c_cns_tm){
		this.c_cns_tm = c_cns_tm;
	}

	public void setC_chrg_pers(String c_chrg_pers){
		this.c_chrg_pers = c_chrg_pers;
	}

	public void setC_tel_no(String c_tel_no){
		this.c_tel_no = c_tel_no;
	}

	public void setC_clsf(String c_clsf){
		this.c_clsf = c_clsf;
	}

	public void setC_vist_purp(String c_vist_purp){
		this.c_vist_purp = c_vist_purp;
	}

	public void setC_remk(String c_remk){
		this.c_remk = c_remk;
	}

	public String getC_make_dtls_seq(){
		return this.c_make_dtls_seq;
	}

	public String getC_dlco(){
		return this.c_dlco;
	}

	public String getC_cns_tm(){
		return this.c_cns_tm;
	}

	public String getC_chrg_pers(){
		return this.c_chrg_pers;
	}

	public String getC_tel_no(){
		return this.c_tel_no;
	}

	public String getC_clsf(){
		return this.c_clsf;
	}

	public String getC_vist_purp(){
		return this.c_vist_purp;
	}

	public String getC_remk(){
		return this.c_remk;
	}
}

/* 작성시간 : Thu Jun 07 19:41:22 KST 2012 */