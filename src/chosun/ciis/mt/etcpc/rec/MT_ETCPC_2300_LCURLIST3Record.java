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


public class MT_ETCPC_2300_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String swnm;
	public String swmang_no;

	public MT_ETCPC_2300_LCURLIST3Record(){}

	public void setSwnm(String swnm){
		this.swnm = swnm;
	}

	public void setSwmang_no(String swmang_no){
		this.swmang_no = swmang_no;
	}

	public String getSwnm(){
		return this.swnm;
	}

	public String getSwmang_no(){
		return this.swmang_no;
	}
}

/* �ۼ��ð� : Tue Jul 07 11:20:32 KST 2009 */