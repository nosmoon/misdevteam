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


package chosun.ciis.mt.etcpc.rec;

import java.sql.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

/**
 * 
 */


public class MT_ETCPC_3003_MCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String swmang_no;
	public String swnm;

	public MT_ETCPC_3003_MCURLIST1Record(){}

	public void setSwmang_no(String swmang_no){
		this.swmang_no = swmang_no;
	}

	public void setSwnm(String swnm){
		this.swnm = swnm;
	}

	public String getSwmang_no(){
		return this.swmang_no;
	}

	public String getSwnm(){
		return this.swnm;
	}
}

/* �ۼ��ð� : Sat Mar 28 18:03:45 KST 2009 */