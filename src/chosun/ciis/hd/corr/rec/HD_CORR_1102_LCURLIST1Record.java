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


package chosun.ciis.hd.corr.rec;

import java.sql.*;
import chosun.ciis.hd.corr.dm.*;
import chosun.ciis.hd.corr.ds.*;

/**
 * 
 */


public class HD_CORR_1102_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String aplc_frex_stot;
	public String aplc_won_stot;
	public String adjm_frex_stot;
	public String adjm_won_stot;

	public HD_CORR_1102_LCURLIST1Record(){}

	public void setAplc_frex_stot(String aplc_frex_stot){
		this.aplc_frex_stot = aplc_frex_stot;
	}

	public void setAplc_won_stot(String aplc_won_stot){
		this.aplc_won_stot = aplc_won_stot;
	}

	public void setAdjm_frex_stot(String adjm_frex_stot){
		this.adjm_frex_stot = adjm_frex_stot;
	}

	public void setAdjm_won_stot(String adjm_won_stot){
		this.adjm_won_stot = adjm_won_stot;
	}

	public String getAplc_frex_stot(){
		return this.aplc_frex_stot;
	}

	public String getAplc_won_stot(){
		return this.aplc_won_stot;
	}

	public String getAdjm_frex_stot(){
		return this.adjm_frex_stot;
	}

	public String getAdjm_won_stot(){
		return this.adjm_won_stot;
	}
}

/* �ۼ��ð� : Fri Apr 10 09:59:40 KST 2009 */