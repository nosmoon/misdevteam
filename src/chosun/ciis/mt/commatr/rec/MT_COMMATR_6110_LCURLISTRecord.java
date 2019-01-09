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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_6110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String add_file_no;
	public String add_file_nm;

	public MT_COMMATR_6110_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAdd_file_no(String add_file_no){
		this.add_file_no = add_file_no;
	}

	public void setAdd_file_nm(String add_file_nm){
		this.add_file_nm = add_file_nm;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAdd_file_no(){
		return this.add_file_no;
	}

	public String getAdd_file_nm(){
		return this.add_file_nm;
	}
}

/* 작성시간 : Thu Mar 07 18:56:00 KST 2013 */