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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_2300_LCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String etc_saly_amt;
	public String year_end;

	public HD_LVCMPY_2300_LCURLIST5Record(){}

	public void setEtc_saly_amt(String etc_saly_amt){
		this.etc_saly_amt = etc_saly_amt;
	}

	public void setYear_end(String year_end){
		this.year_end = year_end;
	}

	public String getEtc_saly_amt(){
		return this.etc_saly_amt;
	}

	public String getYear_end(){
		return this.year_end;
	}
}

/* �ۼ��ð� : Tue Aug 18 09:50:50 KST 2009 */