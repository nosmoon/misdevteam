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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_2300_LCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String etc_saly_amt;
	public String year_end;

	public HD_LVCMPY_2300_LCURLIST5Record(){}

	public void setEtc_saly_amt(String etc_saly_amt){
		this.etc_saly_amt = etc_saly_amt;
	}

	public void setYear_end(String year_end){
		this.year_end = year_end;
	}

	public String getEtc_saly_amt(){
		return this.etc_saly_amt;
	}

	public String getYear_end(){
		return this.year_end;
	}
}

/* 작성시간 : Tue Aug 18 09:50:50 KST 2009 */