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


package chosun.ciis.mt.papmeda.rec;

import java.sql.*;
import chosun.ciis.mt.papmeda.dm.*;
import chosun.ciis.mt.papmeda.ds.*;

/**
 * 
 */


public class MT_PAPMEDA_1201_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String meda_yymm;
	public String fac_clsf;
	public String meda_amt;

	public MT_PAPMEDA_1201_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMeda_yymm(String meda_yymm){
		this.meda_yymm = meda_yymm;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMeda_amt(String meda_amt){
		this.meda_amt = meda_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMeda_yymm(){
		return this.meda_yymm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMeda_amt(){
		return this.meda_amt;
	}
}

/* 작성시간 : Fri May 08 19:35:30 KST 2009 */