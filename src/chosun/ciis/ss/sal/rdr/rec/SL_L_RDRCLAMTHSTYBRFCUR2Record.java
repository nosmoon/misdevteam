/***************************************************************************************************
* ���ϸ� : SL_L_RDRCLAMTHSTYRSLTCURRecord.java
* ��� : ������������-�Աݳ���-�ݳ⵵ ���ݿ��
* �ۼ����� : 2003-12-26
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * ������������-�Աݳ���-�ݳ⵵ ���ݿ��
 *
 */


public class SL_L_RDRCLAMTHSTYBRFCUR2Record extends java.lang.Object implements java.io.Serializable{

	public String subsmappli;
	public String clamtynm;

	public SL_L_RDRCLAMTHSTYBRFCUR2Record(){}

	public void setSubsmappli(String subsmappli){
		this.subsmappli = subsmappli;
	}

	public void setClamtynm(String clamtynm){
		this.clamtynm = clamtynm;
	}

	public String getSubsmappli(){
		return this.subsmappli;
	}

	public String getClamtynm(){
		return this.clamtynm;
	}
}

/* �ۼ��ð� : Mon Dec 22 14:24:57 KST 2003 */