/***************************************************************************************************
* ���ϸ� : .java
* ��� : *��������-���غ���-����-���
* �ۼ����� : 2009-04-09
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * ��������-���غ���-����-���
 */

public class SS_L_INSRAPLC_CHGCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcdt;
	public String deptnm;
	public String areanm;
	public String bonm;
	public String prvflnm;
	public String prvprn;
	public String flnm;
	public String prn;
	public String compdt;
	public String exprdt;

	public SS_L_INSRAPLC_CHGCURCOMMLISTRecord(){}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setPrvflnm(String prvflnm){
		this.prvflnm = prvflnm;
	}

	public void setPrvprn(String prvprn){
		this.prvprn = prvprn;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setCompdt(String compdt){
		this.compdt = compdt;
	}

	public void setExprdt(String exprdt){
		this.exprdt = exprdt;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getPrvflnm(){
		return this.prvflnm;
	}

	public String getPrvprn(){
		return this.prvprn;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getCompdt(){
		return this.compdt;
	}

	public String getExprdt(){
		return this.exprdt;
	}
}

/* �ۼ��ð� : Thu Apr 09 17:16:04 KST 2009 */