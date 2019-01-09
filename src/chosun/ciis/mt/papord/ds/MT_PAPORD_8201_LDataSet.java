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


package chosun.ciis.mt.papord.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_8201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPORD_8201_LDataSet(){}
	public MT_PAPORD_8201_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_PAPORD_8201_LCURLISTRecord rec = new MT_PAPORD_8201_LCURLISTRecord();
			rec.jejisa = Util.checkString(rset0.getString("jejisa"));
			rec.paper_cmpy = Util.checkString(rset0.getString("paper_cmpy"));
			rec.wgt = Util.checkString(rset0.getString("wgt"));
			rec.ewh_wgt = Util.checkString(rset0.getString("ewh_wgt"));
			rec.wgt_tot = Util.checkString(rset0.getString("wgt_tot"));
			rec.rate = Util.checkString(rset0.getString("rate"));
			rec.std_rate = Util.checkString(rset0.getString("std_rate"));
			rec.diff_rate = Util.checkString(rset0.getString("diff_rate"));
			rec.ad_wgt = Util.checkString(rset0.getString("ad_wgt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPORD_8201_LDataSet ds = (MT_PAPORD_8201_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPORD_8201_LCURLISTRecord curlistRec = (MT_PAPORD_8201_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.jejisa%>
<%= curlistRec.paper_cmpy%>
<%= curlistRec.wgt%>
<%= curlistRec.ewh_wgt%>
<%= curlistRec.wgt_tot%>
<%= curlistRec.rate%>
<%= curlistRec.std_rate%>
<%= curlistRec.diff_rate%>
<%= curlistRec.ad_wgt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Nov 01 17:21:52 KST 2016 */