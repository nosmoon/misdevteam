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


public class SE_RCP_5200_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String yymm;

	public SE_RCP_5200_MDataSet(){}
	public SE_RCP_5200_MDataSet(String errcode, String errmsg, String yymm){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SE_RCP_5200_MTEAMLISTRecord rec = new SE_RCP_5200_MTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			SE_RCP_5200_MPARTLISTRecord rec = new SE_RCP_5200_MPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(11);
		while(rset2.next()){
			SE_RCP_5200_MAREALISTRecord rec = new SE_RCP_5200_MAREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_RCP_5200_MDataSet ds = (SE_RCP_5200_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SE_RCP_5200_MTEAMLISTRecord teamlistRec = (SE_RCP_5200_MTEAMLISTRecord)ds.teamlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SE_RCP_5200_MPARTLISTRecord partlistRec = (SE_RCP_5200_MPARTLISTRecord)ds.partlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SE_RCP_5200_MAREALISTRecord arealistRec = (SE_RCP_5200_MAREALISTRecord)ds.arealist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getYymm()%>
<%= ds.getTeamlist()%>
<%= ds.getPartlist()%>
<%= ds.getArealist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= teamlistRec.dept_cd%>
<%= teamlistRec.dept_nm%>
<%= partlistRec.dept_cd%>
<%= partlistRec.dept_nm%>
<%= partlistRec.supr_dept_cd%>
<%= arealistRec.area_cd%>
<%= arealistRec.area_nm%>
<%= arealistRec.dept_cd%>
<%= arealistRec.supr_dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Nov 13 17:13:14 KST 2012 */