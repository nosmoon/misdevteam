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


public class SE_SND_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_1610_LDataSet(){}
	public SE_SND_1610_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset6 = (ResultSet) cstmt.getObject(10);
		while(rset6.next()){
			SE_SND_1610_LCURLISTRecord rec = new SE_SND_1610_LCURLISTRecord();
			rec.prt_plac_nm = Util.checkString(rset6.getString("prt_plac_nm"));
			rec.ledt_nm = Util.checkString(rset6.getString("ledt_nm"));
			rec.ecnt_nm = Util.checkString(rset6.getString("ecnt_nm"));
			rec.route_cd = Util.checkString(rset6.getString("route_cd"));
			rec.route_nm = Util.checkString(rset6.getString("route_nm"));
			rec.qty = Util.checkString(rset6.getString("qty"));
			rec.ariv_nomn = Util.checkString(rset6.getString("ariv_nomn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_1610_LDataSet ds = (SE_SND_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_1610_LCURLISTRecord curlistRec = (SE_SND_1610_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.prt_plac_nm%>
<%= curlistRec.ledt_nm%>
<%= curlistRec.ecnt_nm%>
<%= curlistRec.route_cd%>
<%= curlistRec.route_nm%>
<%= curlistRec.qty%>
<%= curlistRec.ariv_nomn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 13 17:34:20 KST 2009 */