/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 2017-01-05
* �ۼ��� : �� �� ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ :  
* �������� : 
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 *  
 */


public class SS_L_NEWJUSO_APPR_HISCURHISLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String chgbocd;
	public String appryn;
	public String apprdt;
	public String chgpers;
	public String reqdt;
	public String reqpers;

	public SS_L_NEWJUSO_APPR_HISCURHISLISTRecord(){}

	public String getReqdt() {
		return reqdt;
	}

	public void setReqdt(String reqdt) {
		this.reqdt = reqdt;
	}

	public String getReqpers() {
		return reqpers;
	}

	public void setReqpers(String reqpers) {
		this.reqpers = reqpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setChgbocd(String chgbocd){
		this.chgbocd = chgbocd;
	}

	public void setAppryn(String appryn){
		this.appryn = appryn;
	}

	public void setApprdt(String apprdt){
		this.apprdt = apprdt;
	}

	public void setChgpers(String chgpers){
		this.chgpers = chgpers;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getChgbocd(){
		return this.chgbocd;
	}

	public String getAppryn(){
		return this.appryn;
	}

	public String getApprdt(){
		return this.apprdt;
	}

	public String getChgpers(){
		return this.chgpers;
	}
}

/* �ۼ��ð� : Tue Oct 17 16:48:22 KST 2017 */