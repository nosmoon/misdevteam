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


public class FC_ACCT_8121_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String r_wctotamt;
	public String totamt;
	public String sdstotamt;
	public String wctotamt;
	public String w_tcnt;
	public String jmstotamt;
	public String inwoncnt;

	public FC_ACCT_8121_LCURLISTRecord(){}

	public void setR_wctotamt(String r_wctotamt){
		this.r_wctotamt = r_wctotamt;
	}

	public void setTotamt(String totamt){
		this.totamt = totamt;
	}

	public void setSdstotamt(String sdstotamt){
		this.sdstotamt = sdstotamt;
	}

	public void setWctotamt(String wctotamt){
		this.wctotamt = wctotamt;
	}

	public void setW_tcnt(String w_tcnt){
		this.w_tcnt = w_tcnt;
	}

	public void setJmstotamt(String jmstotamt){
		this.jmstotamt = jmstotamt;
	}

	public void setInwoncnt(String inwoncnt){
		this.inwoncnt = inwoncnt;
	}

	public String getR_wctotamt(){
		return this.r_wctotamt;
	}

	public String getTotamt(){
		return this.totamt;
	}

	public String getSdstotamt(){
		return this.sdstotamt;
	}

	public String getWctotamt(){
		return this.wctotamt;
	}

	public String getW_tcnt(){
		return this.w_tcnt;
	}

	public String getJmstotamt(){
		return this.jmstotamt;
	}

	public String getInwoncnt(){
		return this.inwoncnt;
	}
}

/* �ۼ��ð� : Thu Jul 09 13:46:13 KST 2015 */