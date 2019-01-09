/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.tn.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.dm.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_3201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_BAS_3201_LDataSet(){}
	public TN_BAS_3201_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			TN_BAS_3201_LCURLISTRecord rec = new TN_BAS_3201_LCURLISTRecord();
			rec.paymethodcode = Util.checkString(rset0.getString("paymethodcode"));
			rec.parentpaymethodcode = Util.checkString(rset0.getString("parentpaymethodcode"));
			rec.depth_nm = Util.checkString(rset0.getString("depth_nm"));
			rec.depth = Util.checkString(rset0.getString("depth"));
			rec.paymethodtype = Util.checkString(rset0.getString("paymethodtype"));
			rec.paymethodtype_nm = Util.checkString(rset0.getString("paymethodtype_nm"));
			rec.paymethod = Util.checkString(rset0.getString("paymethod"));
			rec.canmodify = Util.checkString(rset0.getString("canmodify"));
			rec.displayorder = Util.checkString(rset0.getString("displayorder"));
			rec.useinsert = Util.checkString(rset0.getString("useinsert"));
			rec.useinsert_nm = Util.checkString(rset0.getString("useinsert_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_BAS_3201_LDataSet ds = (TN_BAS_3201_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_BAS_3201_LCURLISTRecord curlistRec = (TN_BAS_3201_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.paymethodcode%>
<%= curlistRec.parentpaymethodcode%>
<%= curlistRec.depth_nm%>
<%= curlistRec.depth%>
<%= curlistRec.paymethodtype%>
<%= curlistRec.paymethodtype_nm%>
<%= curlistRec.paymethod%>
<%= curlistRec.canmodify%>
<%= curlistRec.displayorder%>
<%= curlistRec.useinsert%>
<%= curlistRec.useinsert_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 18 15:50:50 KST 2016 */