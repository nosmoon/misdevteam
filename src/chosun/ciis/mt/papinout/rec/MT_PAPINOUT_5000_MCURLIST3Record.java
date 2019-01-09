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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_5000_MCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String bank_cd;
	public String bank_nm;

	public MT_PAPINOUT_5000_MCURLIST3Record(){}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}
}

/* 작성시간 : Fri Sep 04 21:35:22 KST 2009 */