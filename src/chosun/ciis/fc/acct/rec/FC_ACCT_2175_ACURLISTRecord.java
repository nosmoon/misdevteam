/***************************************************************************************************
* ���ϸ� : .java
* ��� :  ȸ�����-��ǥ����-���԰��ǰ���-���ݰ�꼭����(����Ʈ��)
* �ۼ����� : 2010-03-08
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * ȸ�����-��ǥ����-���԰��ǰ���-���ݰ�꼭����(����Ʈ��)
 */


public class FC_ACCT_2175_ACURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String col;
	public String slip_occr_dt;
	public String slip_occr_cd;
	public String slip_seq;

	public FC_ACCT_2175_ACURLISTRecord(){}

	public void setCol(String col){
		this.col = col;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_occr_cd(String slip_occr_cd){
		this.slip_occr_cd = slip_occr_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public String getCol(){
		return this.col;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_occr_cd(){
		return this.slip_occr_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}
}

/* �ۼ��ð� : Mon Mar 08 19:25:25 KST 2010 */