/***************************************************************************************************
* ���ϸ� : .java
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


package chosun.ciis.se.bns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BNS_1110_LDataSet(){}
	public SE_BNS_1110_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_BNS_1110_LCURLISTRecord rec = new SE_BNS_1110_LCURLISTRecord();
			rec.bns_item_cd = Util.checkString(rset0.getString("bns_item_cd"));
			rec.bns_item_nm = Util.checkString(rset0.getString("bns_item_nm"));
			rec.bns_item_clas = Util.checkString(rset0.getString("bns_item_clas"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.divn_uprc = Util.checkString(rset0.getString("divn_uprc"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BNS_1110_LDataSet ds = (SE_BNS_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BNS_1110_LCURLISTRecord curlistRec = (SE_BNS_1110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bns_item_cd%>
<%= curlistRec.bns_item_nm%>
<%= curlistRec.bns_item_clas%>
<%= curlistRec.uprc%>
<%= curlistRec.divn_uprc%>
<%= curlistRec.use_yn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Aug 28 13:46:24 KST 2017 */