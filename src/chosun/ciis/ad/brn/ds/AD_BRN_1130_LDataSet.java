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


package chosun.ciis.ad.brn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.brn.dm.*;
import chosun.ciis.ad.brn.rec.*;

/**
 * 
 */


public class AD_BRN_1130_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BRN_1130_LDataSet(){}
	public AD_BRN_1130_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			AD_BRN_1130_LCURLISTRecord rec = new AD_BRN_1130_LCURLISTRecord();
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.sect = Util.checkString(rset0.getString("sect"));
			rec.hndl_nm_cd = Util.checkString(rset0.getString("hndl_nm_cd"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.hndl_evlt_cd = Util.checkString(rset0.getString("hndl_evlt_cd"));
			rec.other = Util.checkString(rset0.getString("other"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.slcrg_remk = Util.checkString(rset0.getString("slcrg_remk"));
			rec.slcrg_nm = Util.checkString(rset0.getString("slcrg_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_BRN_1130_LDataSet ds = (AD_BRN_1130_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BRN_1130_LCURLISTRecord curlistRec = (AD_BRN_1130_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pubc_dt%>
<%= curlistRec.sect%>
<%= curlistRec.hndl_nm_cd%>
<%= curlistRec.advt_cont%>
<%= curlistRec.dn%>
<%= curlistRec.cm%>
<%= curlistRec.hndl_evlt_cd%>
<%= curlistRec.other%>
<%= curlistRec.remk%>
<%= curlistRec.slcrg_remk%>
<%= curlistRec.slcrg_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 01 09:55:46 KST 2014 */