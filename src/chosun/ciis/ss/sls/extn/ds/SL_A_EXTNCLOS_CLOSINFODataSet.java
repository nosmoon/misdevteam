/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Ǹ� Ȯ�����˺ν� ���˸������� ��ȸ
* �ۼ����� : 2012-01-12
* �ۼ��� : ����
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
 * 
 */


public class SL_A_EXTNCLOS_CLOSINFODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String closyn;
	public String issupyn;

	public SL_A_EXTNCLOS_CLOSINFODataSet(){}
	public SL_A_EXTNCLOS_CLOSINFODataSet(String errcode, String errmsg, String closyn, String issupyn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.closyn = closyn;
		this.issupyn = issupyn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setIssupyn(String issupyn){
		this.issupyn = issupyn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getIssupyn(){
		return this.issupyn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.closyn = Util.checkString(cstmt.getString(4));
		this.issupyn = Util.checkString(cstmt.getString(5));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SL_A_EXTNCLOS_CLOSINFODataSet ds = (SL_A_EXTNCLOS_CLOSINFODataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getClosyn()%>
<%= ds.getIssupyn()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jan 12 16:41:20 KST 2012 */