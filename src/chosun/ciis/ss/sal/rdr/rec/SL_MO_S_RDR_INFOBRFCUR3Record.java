/***************************************************************************************************
* ���ϸ� :
* ��� :
* �ۼ����� : 2015-10-21
* �ۼ��� : �� �� ��
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
 *
 */


public class SL_MO_S_RDR_INFOBRFCUR3Record extends java.lang.Object implements java.io.Serializable{

	public String subsmappli;
	public String clamtynm;

	public SL_MO_S_RDR_INFOBRFCUR3Record(){}

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

/* �ۼ��ð� : Mon Jan 02 11:35:46 KST 2017 */