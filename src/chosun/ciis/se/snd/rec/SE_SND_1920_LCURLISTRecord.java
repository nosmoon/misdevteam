/***************************************************************************************************
* ���ϸ� : SE_SND_1920_LCURLISTRecord.java
* ��� : �Ǹ�-�߼۰���-�߼۸�����
* �ۼ����� : 2009-02-10
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_1920_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_nm;
	public String ecnt_nm;
	public String ledt_nm;
	public String qty;
	public String prt_plac_nm;

	public SE_SND_1920_LCURLISTRecord(){}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setEcnt_nm(String ecnt_nm){
		this.ecnt_nm = ecnt_nm;
	}

	public void setLedt_nm(String ledt_nm){
		this.ledt_nm = ledt_nm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setPrt_plac_nm(String prt_plac_nm){
		this.prt_plac_nm = prt_plac_nm;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getEcnt_nm(){
		return this.ecnt_nm;
	}

	public String getLedt_nm(){
		return this.ledt_nm;
	}

	public String getQty(){
		return this.qty;
	}

	public String getPrt_plac_nm(){
		return this.prt_plac_nm;
	}
}

/* �ۼ��ð� : Tue Feb 10 14:57:13 KST 2009 */