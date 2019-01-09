/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���� - �������� - ������ǥ
* �ۼ����� : 2010-07-14
* �ۼ��� : �̹�ȿ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mt.close.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.rec.*;

/**
 * 
 */


public class MT_CLOSE_6120_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_CLOSE_6120_LDataSet(){}
	public MT_CLOSE_6120_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			MT_CLOSE_6120_LCURLISTRecord rec = new MT_CLOSE_6120_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.fac_nm = Util.checkString(rset0.getString("fac_nm"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.issu_cnt = Util.checkString(rset0.getString("issu_cnt"));
			rec.issu_pcnt = Util.checkString(rset0.getString("issu_pcnt"));
			rec.issu_real_pcnt = Util.checkString(rset0.getString("issu_real_pcnt"));
			rec.issu_qty = Util.checkString(rset0.getString("issu_qty"));
			rec.issu_medi_pcnt = Util.checkString(rset0.getString("issu_medi_pcnt"));
			rec.issu_tot_pcnt = Util.checkString(rset0.getString("issu_tot_pcnt"));
			rec.w_amt = Util.checkString(rset0.getString("w_amt"));
			rec.b_amt = Util.checkString(rset0.getString("b_amt"));
			rec.y_amt = Util.checkString(rset0.getString("y_amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.ndduc_rate = Util.checkString(rset0.getString("ndduc_rate"));
			rec.one_qty = Util.checkString(rset0.getString("one_qty"));
			rec.one_pcnt = Util.checkString(rset0.getString("one_pcnt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_CLOSE_6120_LDataSet ds = (MT_CLOSE_6120_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_CLOSE_6120_LCURLISTRecord curlistRec = (MT_CLOSE_6120_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.fac_nm%>
<%= curlistRec.medi_nm%>
<%= curlistRec.issu_cnt%>
<%= curlistRec.issu_pcnt%>
<%= curlistRec.issu_qty%>
<%= curlistRec.issu_medi_pcnt%>
<%= curlistRec.issu_tot_pcnt%>
<%= curlistRec.w_amt%>
<%= curlistRec.b_amt%>
<%= curlistRec.y_amt%>
<%= curlistRec.tot_amt%>
<%= curlistRec.ndduc_rate%>
<%= curlistRec.one_qty%>
<%= curlistRec.one_pcnt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 15 14:27:24 KST 2010 */