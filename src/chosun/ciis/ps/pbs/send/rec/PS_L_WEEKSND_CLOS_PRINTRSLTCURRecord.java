/***************************************************************************************************
* ���ϸ� : SP_PS_L_WEEKSND_CLOS_PRINT.java  
* ��� :   ���Ǿ��������ý��� ���긶�� �������ȭ��
* �ۼ����� : 2007-11-02
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 *  ���Ǿ��������ý��� ���긶�� �������ȭ��
 *
 **/

public class PS_L_WEEKSND_CLOS_PRINTRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String banknm;
	public String bankcd;
	public String acctno;
	public String deps_persnm;
	public String bonm;
	public String bocd;
	public String deptnm;
	public String areanm;
	public int totcnt;
	public int dlvamt;

	public PS_L_WEEKSND_CLOS_PRINTRSLTCURRecord(){}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setBankcd(String bankcd){
		this.bankcd = bankcd;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setDeps_persnm(String deps_persnm){
		this.deps_persnm = deps_persnm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setTotcnt(int totcnt){
		this.totcnt = totcnt;
	}

	public void setDlvamt(int dlvamt){
		this.dlvamt = dlvamt;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getBankcd(){
		return this.bankcd;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getDeps_persnm(){
		return this.deps_persnm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public int getTotcnt(){
		return this.totcnt;
	}

	public int getDlvamt(){
		return this.dlvamt;
	}
}

/* �ۼ��ð� : Fri Nov 02 11:21:11 KST 2007 */