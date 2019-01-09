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


public class FC_ACCT_8121_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf_cd;
	public String dlco_cd;
	public String cucustnm;
	public String obj_amt;
	public String crdt_amt;
	public String sdstotamt;
	public String jmstotamt;
	public String cnt;
	public String inwoncnt;

	public FC_ACCT_8121_LCURLIST2Record(){}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setCucustnm(String cucustnm){
		this.cucustnm = cucustnm;
	}

	public void setObj_amt(String obj_amt){
		this.obj_amt = obj_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setSdstotamt(String sdstotamt){
		this.sdstotamt = sdstotamt;
	}

	public void setJmstotamt(String jmstotamt){
		this.jmstotamt = jmstotamt;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setInwoncnt(String inwoncnt){
		this.inwoncnt = inwoncnt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getCucustnm(){
		return this.cucustnm;
	}

	public String getObj_amt(){
		return this.obj_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getSdstotamt(){
		return this.sdstotamt;
	}

	public String getJmstotamt(){
		return this.jmstotamt;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getInwoncnt(){
		return this.inwoncnt;
	}
}

/* 작성시간 : Thu Jul 09 13:46:13 KST 2015 */