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


public class FC_ACCT_1032_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mang_item_cd;
	public String mang_item_cdnm;
	public String prty_rank;
	public String bal_mang_clsf;
	public String drcr_clsf;
	public String mand_reg_yn;

	public FC_ACCT_1032_LCURLISTRecord(){}

	public void setMang_item_cd(String mang_item_cd){
		this.mang_item_cd = mang_item_cd;
	}

	public void setMang_item_cdnm(String mang_item_cdnm){
		this.mang_item_cdnm = mang_item_cdnm;
	}

	public void setPrty_rank(String prty_rank){
		this.prty_rank = prty_rank;
	}

	public void setBal_mang_clsf(String bal_mang_clsf){
		this.bal_mang_clsf = bal_mang_clsf;
	}

	public void setDrcr_clsf(String drcr_clsf){
		this.drcr_clsf = drcr_clsf;
	}

	public void setMand_reg_yn(String mand_reg_yn){
		this.mand_reg_yn = mand_reg_yn;
	}

	public String getMang_item_cd(){
		return this.mang_item_cd;
	}

	public String getMang_item_cdnm(){
		return this.mang_item_cdnm;
	}

	public String getPrty_rank(){
		return this.prty_rank;
	}

	public String getBal_mang_clsf(){
		return this.bal_mang_clsf;
	}

	public String getDrcr_clsf(){
		return this.drcr_clsf;
	}

	public String getMand_reg_yn(){
		return this.mand_reg_yn;
	}
}

/* �ۼ��ð� : Fri Feb 27 17:43:58 KST 2009 */