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


package chosun.ciis.as.redm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.redm.dm.*;
import chosun.ciis.as.redm.rec.*;

/**
 * 
 */


public class AS_REDM_1201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_REDM_1201_LDataSet(){}
	public AS_REDM_1201_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AS_REDM_1201_LCURLISTRecord rec = new AS_REDM_1201_LCURLISTRecord();
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.aset_nm = Util.checkString(rset0.getString("aset_nm"));
			rec.meda_amt = Util.checkString(rset0.getString("meda_amt"));
			rec.redm_extt_amt = Util.checkString(rset0.getString("redm_extt_amt"));
			rec.cur_redm_agg_amt = Util.checkString(rset0.getString("cur_redm_agg_amt"));
			rec.pre_bi_amt = Util.checkString(rset0.getString("pre_bi_amt"));
			rec.stcuramt = Util.checkString(rset0.getString("stcuramt"));
			rec.cur_end_bi_amt = Util.checkString(rset0.getString("cur_end_bi_amt"));
			rec.redm_mthd_cd = Util.checkString(rset0.getString("redm_mthd_cd"));
			rec.redm_stat_cd = Util.checkString(rset0.getString("redm_stat_cd"));
			rec.hsty__stat_cd = Util.checkString(rset0.getString("hsty__stat_cd"));
			rec.acct_book_amt = Util.checkString(rset0.getString("acct_book_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AS_REDM_1201_LDataSet ds = (AS_REDM_1201_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_REDM_1201_LCURLISTRecord curlistRec = (AS_REDM_1201_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.aset_no%>
<%= curlistRec.aset_nm%>
<%= curlistRec.meda_amt%>
<%= curlistRec.redm_extt_amt%>
<%= curlistRec.cur_redm_agg_amt%>
<%= curlistRec.pre_bi_amt%>
<%= curlistRec.stcuramt%>
<%= curlistRec.cur_end_bi_amt%>
<%= curlistRec.redm_mthd_cd%>
<%= curlistRec.redm_stat_cd%>
<%= curlistRec.hsty__stat_cd%>
<%= curlistRec.acct_book_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 12 16:11:35 KST 2009 */