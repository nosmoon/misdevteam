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


package chosun.ciis.mt.etcimpt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcimpt.dm.*;
import chosun.ciis.mt.etcimpt.rec.*;

/**
 * 
 */


public class MT_ETCIMPT_1205_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCIMPT_1205_LDataSet(){}
	public MT_ETCIMPT_1205_LDataSet(String errcode, String errmsg){
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
			MT_ETCIMPT_1205_LCURLISTRecord rec = new MT_ETCIMPT_1205_LCURLISTRecord();
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.leas_clsf_nm = Util.checkString(rset0.getString("leas_clsf_nm"));
			rec.case_nm = Util.checkString(rset0.getString("case_nm"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.cost_case_titl = Util.checkString(rset0.getString("cost_case_titl"));
			rec.real_ship_dt = Util.checkString(rset0.getString("real_ship_dt"));
			rec.ship_port = Util.checkString(rset0.getString("ship_port"));
			rec.ariv_port = Util.checkString(rset0.getString("ariv_port"));
			rec.entr_dt = Util.checkString(rset0.getString("entr_dt"));
			rec.yy = Util.checkString(rset0.getString("yy"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.leas_clsf = Util.checkString(rset0.getString("leas_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_ETCIMPT_1205_LDataSet ds = (MT_ETCIMPT_1205_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_ETCIMPT_1205_LCURLISTRecord curlistRec = (MT_ETCIMPT_1205_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.mang_no%>
<%= curlistRec.leas_clsf_nm%>
<%= curlistRec.case_nm%>
<%= curlistRec.sub_seq%>
<%= curlistRec.cost_case_titl%>
<%= curlistRec.real_ship_dt%>
<%= curlistRec.ship_port%>
<%= curlistRec.ariv_port%>
<%= curlistRec.entr_dt%>
<%= curlistRec.yy%>
<%= curlistRec.seq%>
<%= curlistRec.leas_clsf%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Jul 04 17:35:55 KST 2009 */