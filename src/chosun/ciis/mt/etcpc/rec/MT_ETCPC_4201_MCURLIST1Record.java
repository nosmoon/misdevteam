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


public class MT_ETCPC_4201_MCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String swmang_no;
	public String use_usag;
	public String swlics_cnt;
	public String swnm;

	public MT_ETCPC_4201_MCURLIST1Record(){}

	public void setSwmang_no(String swmang_no){
		this.swmang_no = swmang_no;
	}

	public void setUse_usag(String use_usag){
		this.use_usag = use_usag;
	}

	public void setSwlics_cnt(String swlics_cnt){
		this.swlics_cnt = swlics_cnt;
	}

	public void setSwnm(String swnm){
		this.swnm = swnm;
	}

	public String getSwmang_no(){
		return this.swmang_no;
	}

	public String getUse_usag(){
		return this.use_usag;
	}

	public String getSwlics_cnt(){
		return this.swlics_cnt;
	}

	public String getSwnm(){
		return this.swnm;
	}
}

/* �ۼ��ð� : Fri Apr 03 18:15:39 KST 2009 */