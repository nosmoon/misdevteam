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


public class MT_ETCPC_2300_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String swver;
	public String scnt;
	public String swlics_cnt;
	public String swclsf;

	public MT_ETCPC_2300_LCURLIST2Record(){}

	public void setSwver(String swver){
		this.swver = swver;
	}

	public void setScnt(String scnt){
		this.scnt = scnt;
	}

	public void setSwlics_cnt(String swlics_cnt){
		this.swlics_cnt = swlics_cnt;
	}

	public void setSwclsf(String swclsf){
		this.swclsf = swclsf;
	}

	public String getSwver(){
		return this.swver;
	}

	public String getScnt(){
		return this.scnt;
	}

	public String getSwlics_cnt(){
		return this.swlics_cnt;
	}

	public String getSwclsf(){
		return this.swclsf;
	}
}

/* �ۼ��ð� : Tue Jul 07 11:20:32 KST 2009 */