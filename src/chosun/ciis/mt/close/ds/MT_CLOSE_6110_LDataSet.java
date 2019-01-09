/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���� - �������� - ����
* �ۼ����� : 2010-07-07
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


public class MT_CLOSE_6110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_CLOSE_6110_LDataSet(){}
	public MT_CLOSE_6110_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			MT_CLOSE_6110_LCURLISTRecord rec = new MT_CLOSE_6110_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.w_wgt = Util.checkString(rset0.getString("w_wgt"));
			rec.w_amt = Util.checkString(rset0.getString("w_amt"));
			rec.b_isink_amt = Util.checkString(rset0.getString("b_isink_amt"));
			rec.b_isgt_amt = Util.checkString(rset0.getString("b_isgt_amt"));
			rec.b_hsjr_amt = Util.checkString(rset0.getString("b_hsjr_amt"));
			rec.b_pjjr_amt = Util.checkString(rset0.getString("b_pjjr_amt"));
			rec.b_smjj_amt = Util.checkString(rset0.getString("b_smjj_amt"));
			rec.b_tot_amt = Util.checkString(rset0.getString("b_tot_amt"));
			rec.ndduc_rate = Util.checkString(rset0.getString("ndduc_rate"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_CLOSE_6110_LDataSet ds = (MT_CLOSE_6110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_CLOSE_6110_LCURLISTRecord curlistRec = (MT_CLOSE_6110_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.w_wgt%>
<%= curlistRec.w_amt%>
<%= curlistRec.b_isink_amt%>
<%= curlistRec.b_isgt_amt%>
<%= curlistRec.b_hsjr_amt%>
<%= curlistRec.b_pjjr_amt%>
<%= curlistRec.b_smjj_amt%>
<%= curlistRec.b_tot_amt%>
<%= curlistRec.ndduc_rate%>
<%= curlistRec.tot_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jul 07 18:11:19 KST 2010 */