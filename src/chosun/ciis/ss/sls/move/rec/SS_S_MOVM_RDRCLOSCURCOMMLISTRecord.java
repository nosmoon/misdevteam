/***************************************************************************************************
* ���ϸ� : SS_S_MOVM_RDRCLOSCURCOMMLISTRecord.java
* ��� : �̻絶��-����-�� �̻絶�� ��ü����� ���� Record
* �ۼ����� : 2004-01-07
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
 * �̻絶��-����-�� �̻絶�� ��ü����� ���� Record
 */

public class SS_S_MOVM_RDRCLOSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medicdnm;
	public int alonamt;
	public String qtyaplydt;
	public int basivalqty;

	public SS_S_MOVM_RDRCLOSCURCOMMLISTRecord(){}

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

/* �ۼ��ð� : Thu Jan 08 20:25:03 KST 2004 */