/***************************************************************************************************
* ���ϸ� : SS_L_MOVM_RDR_RMTT_PRINTCURCOMMLISTRecord.java
* ��� : �̻絶��-�۱�-�μ⸦ ���� Record
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.move.rec;

import java.sql.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.ds.*;

/**
 * �̻絶��-�۱�-�μ⸦ ���� Record
 */

public class SS_L_MOVM_RDR_RMTT_PRINTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String areanm;
	public String bonm;
	public String deps_persnm;
	public String banknm;
	public String acctno;
	public int costamt;

	public SS_L_MOVM_RDR_RMTT_PRINTCURCOMMLISTRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setDeps_persnm(String deps_persnm){
		this.deps_persnm = deps_persnm;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setCostamt(int costamt){
		this.costamt = costamt;
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

	public String getDeps_persnm(){
		return this.deps_persnm;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public int getCostamt(){
		return this.costamt;
	}
}

/* �ۼ��ð� : Sat May 08 14:07:59 KST 2004 */