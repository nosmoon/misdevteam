/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2293_SCUR_WHCO_NDSTB_CD_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String whco_ndstb_cd;
	public String whco_comn_cost_yn;

	public FC_ACCT_2293_SCUR_WHCO_NDSTB_CD_LISTRecord(){}

	public void setWhco_ndstb_cd(String whco_ndstb_cd){
		this.whco_ndstb_cd = whco_ndstb_cd;
	}

	public void setWhco_comn_cost_yn(String whco_comn_cost_yn){
		this.whco_comn_cost_yn = whco_comn_cost_yn;
	}

	public String getWhco_ndstb_cd(){
		return this.whco_ndstb_cd;
	}

	public String getWhco_comn_cost_yn(){
		return this.whco_comn_cost_yn;
	}
}

/* �ۼ��ð� : Thu Apr 23 11:05:59 KST 2009 */