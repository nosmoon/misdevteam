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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2904_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aprv_slip_occr_dt;
	public String aprv_slip_clsf;
	public String aprv_slip_occr_seqo;
	public String aprv_slip_occr_sub_seq;
	public String aprv_slip_no;
	public String aprv_slip_no1;

	public FC_ACCT_2904_LCURLISTRecord(){}

	public void setAprv_slip_occr_dt(String aprv_slip_occr_dt){
		this.aprv_slip_occr_dt = aprv_slip_occr_dt;
	}

	public void setAprv_slip_clsf(String aprv_slip_clsf){
		this.aprv_slip_clsf = aprv_slip_clsf;
	}

	public void setAprv_slip_occr_seqo(String aprv_slip_occr_seqo){
		this.aprv_slip_occr_seqo = aprv_slip_occr_seqo;
	}

	public void setAprv_slip_occr_sub_seq(String aprv_slip_occr_sub_seq){
		this.aprv_slip_occr_sub_seq = aprv_slip_occr_sub_seq;
	}

	public void setAprv_slip_no(String aprv_slip_no){
		this.aprv_slip_no = aprv_slip_no;
	}

	public void setAprv_slip_no1(String aprv_slip_no1){
		this.aprv_slip_no1 = aprv_slip_no1;
	}

	public String getAprv_slip_occr_dt(){
		return this.aprv_slip_occr_dt;
	}

	public String getAprv_slip_clsf(){
		return this.aprv_slip_clsf;
	}

	public String getAprv_slip_occr_seqo(){
		return this.aprv_slip_occr_seqo;
	}

	public String getAprv_slip_occr_sub_seq(){
		return this.aprv_slip_occr_sub_seq;
	}

	public String getAprv_slip_no(){
		return this.aprv_slip_no;
	}

	public String getAprv_slip_no1(){
		return this.aprv_slip_no1;
	}
}

/* 작성시간 : Thu Aug 06 16:01:18 KST 2009 */