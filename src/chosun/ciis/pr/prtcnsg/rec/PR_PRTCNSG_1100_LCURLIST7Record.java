/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.pr.prtcnsg.rec;

import java.sql.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.ds.*;

/**
 * 
 */


public class PR_PRTCNSG_1100_LCURLIST7Record extends java.lang.Object implements java.io.Serializable{

	public String paper_uprc;
	public String paper_portage;

	public PR_PRTCNSG_1100_LCURLIST7Record(){}

	public void setPaper_uprc(String paper_uprc){
		this.paper_uprc = paper_uprc;
	}

	public void setPaper_portage(String paper_portage){
		this.paper_portage = paper_portage;
	}

	public String getPaper_uprc(){
		return this.paper_uprc;
	}

	public String getPaper_portage(){
		return this.paper_portage;
	}
}

/* �ۼ��ð� : Wed Aug 26 16:34:34 KST 2009 */