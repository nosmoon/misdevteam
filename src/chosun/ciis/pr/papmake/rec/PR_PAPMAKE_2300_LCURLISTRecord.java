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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_2300_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String clos_yymm;
	public String fac_clsf;
	public String prt_fee;

	public PR_PAPMAKE_2300_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_yymm(String clos_yymm){
		this.clos_yymm = clos_yymm;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPrt_fee(String prt_fee){
		this.prt_fee = prt_fee;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClos_yymm(){
		return this.clos_yymm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPrt_fee(){
		return this.prt_fee;
	}
}

/* 작성시간 : Sat Oct 31 14:58:05 KST 2009 */