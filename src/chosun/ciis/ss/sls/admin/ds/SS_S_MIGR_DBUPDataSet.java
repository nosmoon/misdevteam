/***************************************************************************************************
* ���ϸ� : SS_S_MIGR_DBUPDataSet.java
* ��� : ������-�۾�-���̱׷��̼�-����DB���ε�-(���ε����, �۾���ȣ)�� ���� DataSet
* �ۼ����� : 2004-03-12
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * ������-�۾�-���̱׷��̼�-����DB���ε�-(���ε����, �۾���ȣ)�� ���� DataSet
 */

public class SS_S_MIGR_DBUPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String bodbupstatcd;
	public String workno;

	public SS_S_MIGR_DBUPDataSet(){}
	public SS_S_MIGR_DBUPDataSet(String errcode, String errmsg, String bodbupstatcd, String workno){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bodbupstatcd = bodbupstatcd;
		this.workno = workno;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBodbupstatcd(String bodbupstatcd){
		this.bodbupstatcd = bodbupstatcd;
	}

	public void setWorkno(String workno){
		this.workno = workno;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBodbupstatcd(){
		return this.bodbupstatcd;
	}

	public String getWorkno(){
		return this.workno;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.bodbupstatcd = Util.checkString(cstmt.getString(4));
		this.workno = Util.checkString(cstmt.getString(5));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_S_MIGR_DBUPDataSet ds = (SS_S_MIGR_DBUPDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBodbupstatcd()%>
<%= ds.getWorkno()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 15 17:15:49 KST 2004 */