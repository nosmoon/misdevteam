/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_EXGCOST_PRINTCURCOMMLISTRecord.java
* ��� : Ȯ����Ȳ-ǰ����Ȯ��-���-�۱� �μ⸦ ���� Record
* �ۼ����� : 2004-04-10
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ-ǰ����Ȯ��-���-�۱� �μ⸦ ���� Record
 */

public class SS_L_RDR_EXTN_EXGCOST_PRINTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String areanm;
	public String bonm;
	public String bo_headnm;
	public String prn;
	public String banknm;
	public String acctno;
	public int costamt;

	public SS_L_RDR_EXTN_EXGCOST_PRINTCURCOMMLISTRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBo_headnm(String bo_headnm){
		this.bo_headnm = bo_headnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
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

	public String getBo_headnm(){
		return this.bo_headnm;
	}

	public String getPrn(){
		return this.prn;
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

/* �ۼ��ð� : Fri Apr 30 17:29:02 KST 2004 */