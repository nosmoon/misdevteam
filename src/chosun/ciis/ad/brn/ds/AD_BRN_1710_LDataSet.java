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

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.brn.rec.AD_BRN_1710_LCURLISTRecord;

/**
 * 
 */


public class AD_BRN_1710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String totalcnt;

	public AD_BRN_1710_LDataSet(){}
	public AD_BRN_1710_LDataSet(String errcode, String errmsg, String totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(String totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.totalcnt = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			AD_BRN_1710_LCURLISTRecord rec = new AD_BRN_1710_LCURLISTRecord();
			rec.wr_clsf = Util.checkString(rset0.getString("wr_clsf"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.answer_yn = Util.checkString(rset0.getString("answer_yn"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.make_pers = Util.checkString(rset0.getString("make_pers"));
			rec.add_file_nm = Util.checkString(rset0.getString("add_file_nm"));
			rec.job_clsf = Util.checkString(rset0.getString("job_clsf"));
			rec.cntc_seq = Util.checkString(rset0.getString("cntc_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_BRN_1710_LDataSet ds = (AD_BRN_1710_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BRN_1710_LCURLISTRecord curlistRec = (AD_BRN_1710_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.wr_clsf%>
<%= curlistRec.titl%>
<%= curlistRec.answer_yn%>
<%= curlistRec.make_dt%>
<%= curlistRec.make_pers%>
<%= curlistRec.add_file_nm%>
<%= curlistRec.job_clsf%>
<%= curlistRec.cntc_seq%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 23 21:24:00 KST 2009 */