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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_1710_SCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String unrcp_amt;

	public AD_BAS_1710_SCURLIST1Record(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setUnrcp_amt(String unrcp_amt){
		this.unrcp_amt = unrcp_amt;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getUnrcp_amt(){
		return this.unrcp_amt;
	}
}

/* �ۼ��ð� : Thu Aug 27 20:10:30 KST 2009 */