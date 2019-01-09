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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_2092_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_2092_LDataSet(){}
	public MC_BUDG_2092_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(14);
		while(rset2.next()){
			MC_BUDG_2092_LCURLISTRecord rec = new MC_BUDG_2092_LCURLISTRecord();
			rec.yymm = Util.checkString(rset2.getString("yymm"));
			rec.ghsqty = Util.checkString(rset2.getString("ghsqty"));
			rec.budg_yymm = Util.checkString(rset2.getString("budg_yymm"));
			rec.req_qunt = Util.checkString(rset2.getString("req_qunt"));
			rec.req_uprc = Util.checkString(rset2.getString("req_uprc"));
			rec.req_amt = Util.checkString(rset2.getString("req_amt"));
			rec.rmks = Util.checkString(rset2.getString("rmks"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_2092_LDataSet ds = (MC_BUDG_2092_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_2092_LCURLISTRecord curlistRec = (MC_BUDG_2092_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yymm%>
<%= curlistRec.ghsqty%>
<%= curlistRec.budg_yymm%>
<%= curlistRec.req_qunt%>
<%= curlistRec.req_uprc%>
<%= curlistRec.req_amt%>
<%= curlistRec.rmks%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Jul 11 10:54:09 KST 2009 */