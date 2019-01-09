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


public class IS_BUS_1020_SCURLIST_BRecord extends java.lang.Object implements java.io.Serializable{

	public String b_make_dtls_seq;
	public String b_dlco;
	public String b_cns_tm;
	public String b_chrg_pers;
	public String b_tel_no;
	public String b_clsf;
	public String b_vist_purp;
	public String b_remk;

	public IS_BUS_1020_SCURLIST_BRecord(){}

	public void setB_make_dtls_seq(String b_make_dtls_seq){
		this.b_make_dtls_seq = b_make_dtls_seq;
	}

	public void setB_dlco(String b_dlco){
		this.b_dlco = b_dlco;
	}

	public void setB_cns_tm(String b_cns_tm){
		this.b_cns_tm = b_cns_tm;
	}

	public void setB_chrg_pers(String b_chrg_pers){
		this.b_chrg_pers = b_chrg_pers;
	}

	public void setB_tel_no(String b_tel_no){
		this.b_tel_no = b_tel_no;
	}

	public void setB_clsf(String b_clsf){
		this.b_clsf = b_clsf;
	}

	public void setB_vist_purp(String b_vist_purp){
		this.b_vist_purp = b_vist_purp;
	}

	public void setB_remk(String b_remk){
		this.b_remk = b_remk;
	}

	public String getB_make_dtls_seq(){
		return this.b_make_dtls_seq;
	}

	public String getB_dlco(){
		return this.b_dlco;
	}

	public String getB_cns_tm(){
		return this.b_cns_tm;
	}

	public String getB_chrg_pers(){
		return this.b_chrg_pers;
	}

	public String getB_tel_no(){
		return this.b_tel_no;
	}

	public String getB_clsf(){
		return this.b_clsf;
	}

	public String getB_vist_purp(){
		return this.b_vist_purp;
	}

	public String getB_remk(){
		return this.b_remk;
	}
}

/* 작성시간 : Thu Jun 07 19:41:22 KST 2012 */