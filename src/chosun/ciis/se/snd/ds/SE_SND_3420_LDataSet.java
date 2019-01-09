/***************************************************************************************************
* ���ϸ� : SE_SND_3420_LDataSet.java
* ��� : �Ǹ� - �߼۰��� - ��ǥ�뼱, �뼱 ����
* �ۼ����� : 2009-05-14
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_3420_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList inlist = new ArrayList();
	public ArrayList nolist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_3420_LDataSet(){}
	public SE_SND_3420_LDataSet(String errcode, String errmsg){
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
		this.errcode 			= Util.checkString(cstmt.getString(1));
		this.errmsg 			= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 		= (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_SND_3420_LINLISTRecord rec = new SE_SND_3420_LINLISTRecord();
			rec.route_clsf 		= Util.checkString(rset0.getString("route_clsf"		));
			rec.rptv_route_cd 	= Util.checkString(rset0.getString("rptv_route_cd"	));
			rec.rptv_route_nm 	= Util.checkString(rset0.getString("rptv_route_nm"	));
			rec.route_cd 		= Util.checkString(rset0.getString("route_cd"		));
			rec.route_nm 		= Util.checkString(rset0.getString("route_nm"		));
			this.inlist.add(rec);
		}
		ResultSet rset1 		= (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SE_SND_3420_LNOLISTRecord rec = new SE_SND_3420_LNOLISTRecord();
			rec.route_clsf 		= Util.checkString(rset1.getString("route_clsf"		));
			rec.rptv_route_cd 	= Util.checkString(rset1.getString("rptv_route_cd"	));
			rec.rptv_route_nm 	= Util.checkString(rset1.getString("rptv_route_nm"	));
			rec.route_cd 		= Util.checkString(rset1.getString("route_cd"		));
			rec.route_nm 		= Util.checkString(rset1.getString("route_nm"		));
			this.nolist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_3420_LDataSet ds = (SE_SND_3420_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.inlist.size(); i++){
		SE_SND_3420_LINLISTRecord inlistRec = (SE_SND_3420_LINLISTRecord)ds.inlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.nolist.size(); i++){
		SE_SND_3420_LNOLISTRecord nolistRec = (SE_SND_3420_LNOLISTRecord)ds.nolist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getInlist()%>
<%= ds.getNolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= inlistRec.route_clsf%>
<%= inlistRec.rptv_route_cd%>
<%= inlistRec.rptv_route_nm%>
<%= inlistRec.route_cd%>
<%= inlistRec.route_nm%>
<%= nolistRec.route_clsf%>
<%= nolistRec.rptv_route_cd%>
<%= nolistRec.rptv_route_nm%>
<%= nolistRec.route_cd%>
<%= nolistRec.route_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 14 17:12:53 KST 2009 */