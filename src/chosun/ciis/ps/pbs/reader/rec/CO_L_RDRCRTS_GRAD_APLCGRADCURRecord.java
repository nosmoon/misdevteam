/***************************************************************************************************
 * ���ϸ� : CO_L_RDRCRTS_GRAD_APLC.java
 * ��� : ���ڿ���ް���(���ڿ��������ڸ����ȸ)
 * �ۼ����� : 2004-04-29
 * �ۼ��� : �迵��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� : �츮�̿� �̺�Ʈ�� ���� remk �߰�
 * ������ : �����
 * �������� : 2004-11-30
 * ��� : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� : �������� �Ķ���Ͱ� ����
 * ������ : �����
 * �������� : 2005-02-23
 * ��� : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� : ���ݿ����� ���� �׸��߰�
 * ������ : �����
 * �������� : 2005-11-10
 * ��� : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� : ����ϱ�� ���� ���� �׸��߰�
 * ������ : �����
 * �������� : 2006-08-16
 * ��� : 
 ***************************************************************************************************/
 /***************************************************************************************************
 * �������� : Ireader ���� ���� �׸��߰�
 * ������ : �����
 * �������� : 2008-03-06
 * ��� : 
 ***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * ����-����÷���ȸ��,���ݿ�����,���������,Ireaderȸ������
 */

public class CO_L_RDRCRTS_GRAD_APLCGRADCURRecord extends java.lang.Object implements java.io.Serializable{

	public String ciymgbcd;
	public String cicdgb;
	public String cicodeval;
	public String cicdnm;
	public String cicdynm;

	public CO_L_RDRCRTS_GRAD_APLCGRADCURRecord(){}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCicdynm(){
		return this.cicdynm;
	}
}

/* �ۼ��ð� : Fri Mar 07 16:36:06 KST 2008 */