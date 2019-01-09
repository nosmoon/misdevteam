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


public class FC_ACCT_8072_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String inwoncnt;
	public String w_tcnt;
	public String totamt;
	public String sdstotamt;
	public String jmstotamt;
	public String wctotamt;
	public String pytotamt;
	public String sdtotamt;

	public FC_ACCT_8072_LCURLISTRecord(){}

	public void setInwoncnt(String inwoncnt){
		this.inwoncnt = inwoncnt;
	}

	public void setW_tcnt(String w_tcnt){
		this.w_tcnt = w_tcnt;
	}

	public void setTotamt(String totamt){
		this.totamt = totamt;
	}

	public void setSdstotamt(String sdstotamt){
		this.sdstotamt = sdstotamt;
	}

	public void setJmstotamt(String jmstotamt){
		this.jmstotamt = jmstotamt;
	}

	public void setWctotamt(String wctotamt){
		this.wctotamt = wctotamt;
	}

	public void setPytotamt(String pytotamt){
		this.pytotamt = pytotamt;
	}

	public void setSdtotamt(String sdtotamt){
		this.sdtotamt = sdtotamt;
	}

	public String getInwoncnt(){
		return this.inwoncnt;
	}

	public String getW_tcnt(){
		return this.w_tcnt;
	}

	public String getTotamt(){
		return this.totamt;
	}

	public String getSdstotamt(){
		return this.sdstotamt;
	}

	public String getJmstotamt(){
		return this.jmstotamt;
	}

	public String getWctotamt(){
		return this.wctotamt;
	}

	public String getPytotamt(){
		return this.pytotamt;
	}

	public String getSdtotamt(){
		return this.sdtotamt;
	}
}

/* 작성시간 : Thu Jul 09 13:17:12 KST 2015 */