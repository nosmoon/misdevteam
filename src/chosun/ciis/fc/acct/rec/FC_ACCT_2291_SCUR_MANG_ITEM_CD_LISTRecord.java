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


public class FC_ACCT_2291_SCUR_MANG_ITEM_CD_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mang_item_cd;
	public String drcr_clsf;

	public FC_ACCT_2291_SCUR_MANG_ITEM_CD_LISTRecord(){}

	public void setMang_item_cd(String mang_item_cd){
		this.mang_item_cd = mang_item_cd;
	}

	public void setDrcr_clsf(String drcr_clsf){
		this.drcr_clsf = drcr_clsf;
	}

	public String getMang_item_cd(){
		return this.mang_item_cd;
	}

	public String getDrcr_clsf(){
		return this.drcr_clsf;
	}
}

/* �ۼ��ð� : Wed Apr 22 17:54:06 KST 2009 */