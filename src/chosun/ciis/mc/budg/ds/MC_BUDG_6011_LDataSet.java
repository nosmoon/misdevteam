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


public class MC_BUDG_6011_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6011_LDataSet(){}
	public MC_BUDG_6011_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			MC_BUDG_6011_LCURLISTRecord rec = new MC_BUDG_6011_LCURLISTRecord();
			rec.chk_col1 = Util.checkString(rset0.getString("chk_col1"));
			rec.budg_clas_cd = Util.checkString(rset0.getString("budg_clas_cd"));
			rec.ycbrnm = Util.checkString(rset0.getString("ycbrnm"));
			rec.chk_col4 = Util.checkString(rset0.getString("chk_col4"));
			rec.buseocd = Util.checkString(rset0.getString("buseocd"));
			rec.buseocdnm = Util.checkString(rset0.getString("buseocdnm"));
			rec.budg_req_amt = Util.checkString(rset0.getString("budg_req_amt"));
			rec.in_amt = Util.checkString(rset0.getString("in_amt"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.amt2 = Util.checkString(rset0.getString("amt2"));
			rec.rate = Util.checkString(rset0.getString("rate"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_6011_LDataSet ds = (MC_BUDG_6011_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_6011_LCURLISTRecord curlistRec = (MC_BUDG_6011_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.chk_col1%>
<%= curlistRec.budg_clas_cd%>
<%= curlistRec.ycbrnm%>
<%= curlistRec.chk_col4%>
<%= curlistRec.buseocd%>
<%= curlistRec.buseocdnm%>
<%= curlistRec.budg_req_amt%>
<%= curlistRec.in_amt%>
<%= curlistRec.amt%>
<%= curlistRec.amt2%>
<%= curlistRec.rate%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jul 01 11:53:50 KST 2009 */