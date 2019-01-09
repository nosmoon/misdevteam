/***************************************************************************************************
* ���ϸ� : SS_A_RDR_EXTN_EXGCAMP_CLOSEDataSet.java
* ��� : ǰ����Ȯ�� ��ȸ ������ ���� DataSet
* �ۼ����� : 2003-11-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * class definition
 *
 */


public class SS_A_RDR_EXTN_EXGCAMP_CLOSEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String rdr_extncampno;

	public SS_A_RDR_EXTN_EXGCAMP_CLOSEDataSet(){}
	public SS_A_RDR_EXTN_EXGCAMP_CLOSEDataSet(String errcode, String errmsg, String rdr_extncampno){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rdr_extncampno = rdr_extncampno;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRdr_extncampno(String rdr_extncampno){
		this.rdr_extncampno = rdr_extncampno;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRdr_extncampno(){
		return this.rdr_extncampno;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){	return;	}
		this.rdr_extncampno = Util.checkString(cstmt.getString(4));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_A_RDR_EXTN_EXGCAMP_CLOSEDataSet ds = (SS_A_RDR_EXTN_EXGCAMP_CLOSEDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdr_extncampno()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Dec 05 10:29:26 KST 2003 */
