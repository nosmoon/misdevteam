/***************************************************************************************************
* ���ϸ� : SS_S_RDR_EXTN_EMPCAMPCURCOMMLISTRecord.java
* ��� : ���Ȯ���ȸ ��ü����� ���� Record
* �ۼ����� : 2003-11-30
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
 * class definition
 *
 */


public class SS_S_RDR_EXTN_EMPCAMPCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medicdnm;
	public int alonamt;
	public String qtyaplydt;
	public int basivalqty;

	public SS_S_RDR_EXTN_EMPCAMPCURCOMMLISTRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setAlonamt(int alonamt){
		this.alonamt = alonamt;
	}

	public void setQtyaplydt(String qtyaplydt){
		this.qtyaplydt = qtyaplydt;
	}

	public void setBasivalqty(int basivalqty){
		this.basivalqty = basivalqty;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedicdnm(){
		return this.medicdnm;
	}

	public int getAlonamt(){
		return this.alonamt;
	}

	public String getQtyaplydt(){
		return this.qtyaplydt;
	}

	public int getBasivalqty(){
		return this.basivalqty;
	}
}

/* �ۼ��ð� : Wed Dec 10 17:53:29 KST 2003 */