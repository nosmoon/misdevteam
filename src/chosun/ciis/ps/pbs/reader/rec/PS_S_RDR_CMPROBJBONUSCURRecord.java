/***************************************************************************************************
* ���ϸ� : SP_PS_S_RDR_CMPROBJ.java
* ��� :   ����-����ó�� �񱳴�󳻿� ����ȸȭ��
* �ۼ����� : 2004-02-23
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :   
* ��� :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * ����-����ó�� �񱳴�󳻿� ����ȸȭ��
 *
 */


public class PS_S_RDR_CMPROBJBONUSCURRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcseq;
	public String recppersnm;
	public String recpperszip;
	public String recppersaddr;
	public String senddt;
	public String sendclsf;
	public String sendmthd;
	public String memo;

	public PS_S_RDR_CMPROBJBONUSCURRecord(){}

	public void setAplcseq(String aplcseq){
		this.aplcseq = aplcseq;
	}

	public void setRecppersnm(String recppersnm){
		this.recppersnm = recppersnm;
	}

	public void setRecpperszip(String recpperszip){
		this.recpperszip = recpperszip;
	}

	public void setRecppersaddr(String recppersaddr){
		this.recppersaddr = recppersaddr;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public void setSendclsf(String sendclsf){
		this.sendclsf = sendclsf;
	}

	public void setSendmthd(String sendmthd){
		this.sendmthd = sendmthd;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public String getAplcseq(){
		return this.aplcseq;
	}

	public String getRecppersnm(){
		return this.recppersnm;
	}

	public String getRecpperszip(){
		return this.recpperszip;
	}

	public String getRecppersaddr(){
		return this.recppersaddr;
	}

	public String getSenddt(){
		return this.senddt;
	}

	public String getSendclsf(){
		return this.sendclsf;
	}

	public String getSendmthd(){
		return this.sendmthd;
	}

	public String getMemo(){
		return this.memo;
	}
}

/* �ۼ��ð� : Fri Feb 27 15:39:41 KST 2004 */