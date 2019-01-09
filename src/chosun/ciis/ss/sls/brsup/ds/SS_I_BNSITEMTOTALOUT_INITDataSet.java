/***************************************************************************************************
* ���ϸ� : .java
* ��� : ��������-������Ȳ-���˹������Ȳ ��������� ��ǰ�űԵ��   
* �ۼ����� :2009/06/19
* �ۼ��� : ����
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ��������-������Ȳ-���˹������Ȳ ��������� ��ǰ�űԵ��   
 */

public class SS_I_BNSITEMTOTALOUT_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String send_qty;

	public SS_I_BNSITEMTOTALOUT_INITDataSet(){}
	public SS_I_BNSITEMTOTALOUT_INITDataSet(String errcode, String errmsg, String send_qty){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.send_qty = send_qty;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSend_qty(String send_qty){
		this.send_qty = send_qty;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSend_qty(){
		return this.send_qty;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.send_qty = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_I_BNSITEMTOTALOUT_INITDataSet ds = (SS_I_BNSITEMTOTALOUT_INITDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSend_qty()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jun 22 09:03:57 PDT 2009 */