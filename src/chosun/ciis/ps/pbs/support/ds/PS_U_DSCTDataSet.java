/***************************************************************************************************
 * ���ϸ�   : SP_PS_U_DSCT.java
 * ���     : �������-����ó�� �������
 * �ۼ����� : 2004-12-08
 * �ۼ���   : ����ǥ
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     : 
 **************************************************************************************************/


package chosun.ciis.ps.pbs.support.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.rec.*;

/**
 * �������-����ó�� �������
 */

public class PS_U_DSCTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;

	public PS_U_DSCTDataSet(){}
	public PS_U_DSCTDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PS_U_DSCTDataSet ds = (PS_U_DSCTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Dec 09 19:36:12 KST 2004 */