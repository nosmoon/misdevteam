/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_3000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String yymm;

	public SE_RCP_3000_MDataSet(){}
	public SE_RCP_3000_MDataSet(String errcode, String errmsg, String yymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.yymm = yymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getYymm(){
		return this.yymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.yymm = Util.checkString(cstmt.getString(8));
		ResultSet rset6 = (ResultSet) cstmt.getObject(9);
		while(rset6.next()){
			SE_RCP_3000_MTEAMLISTRecord rec = new SE_RCP_3000_MTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset6.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset6.getString("dept_nm"));
			this.teamlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_RCP_3000_MDataSet ds = (SE_RCP_3000_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SE_RCP_3000_MTEAMLISTRecord teamlistRec = (SE_RCP_3000_MTEAMLISTRecord)ds.teamlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getYymm()%>
<%= ds.getTeamlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= teamlistRec.dept_cd%>
<%= teamlistRec.dept_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Sep 15 10:07:22 KST 2009 */