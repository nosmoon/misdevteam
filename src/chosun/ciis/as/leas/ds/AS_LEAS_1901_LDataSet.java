/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ڻ�-�Ӵ��� - ����ݳ��� ����Ȯ��
* �ۼ����� : 2009-10-09
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.as.leas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.rec.*;

/**
 * �ڻ�-�Ӵ��� - ����ݳ��� ����Ȯ��
 */


public class AS_LEAS_1901_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_LEAS_1901_LDataSet(){}
	public AS_LEAS_1901_LDataSet(String errcode, String errmsg){
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
			AS_LEAS_1901_LCURLISTRecord rec = new AS_LEAS_1901_LCURLISTRecord();
			rec.cntr_no = Util.checkString(rset0.getString("cntr_no"));
			rec.clam_yymm = Util.checkString(rset0.getString("clam_yymm"));
			rec.clam_dt = Util.checkString(rset0.getString("clam_dt"));
			rec.clam_tot_amt = Util.checkString(rset0.getString("clam_tot_amt"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.tot1 = Util.checkString(rset0.getString("tot1"));
			rec.tot2 = Util.checkString(rset0.getString("tot2"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.clam_seq = Util.checkString(rset0.getString("clam_seq"));
			rec.in_gubun = Util.checkString(rset0.getString("in_gubun"));
			rec.hire_dlco_ern = Util.checkString(rset0.getString("hire_dlco_ern"));
			rec.hire_dlco_nm = Util.checkString(rset0.getString("hire_dlco_nm"));
			rec.rmtt_plac = Util.checkString(rset0.getString("rmtt_plac"));
			rec.rmtt_dt = Util.checkString(rset0.getString("rmtt_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AS_LEAS_1901_LDataSet ds = (AS_LEAS_1901_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_LEAS_1901_LCURLISTRecord curlistRec = (AS_LEAS_1901_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cntr_no%>
<%= curlistRec.clam_yymm%>
<%= curlistRec.clam_dt%>
<%= curlistRec.clam_tot_amt%>
<%= curlistRec.occr_dt%>
<%= curlistRec.tot1%>
<%= curlistRec.tot2%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.remk%>
<%= curlistRec.clam_seq%>
<%= curlistRec.in_gubun%>
<%= curlistRec.hire_dlco_ern%>
<%= curlistRec.hire_dlco_nm%>
<%= curlistRec.rmtt_plac%>
<%= curlistRec.rmtt_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Dec 17 16:01:11 KST 2009 */