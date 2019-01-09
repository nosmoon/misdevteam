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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1113_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1113_LDataSet(){}
	public FC_FUNC_1113_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			FC_FUNC_1113_LCURLISTRecord rec = new FC_FUNC_1113_LCURLISTRecord();
			rec.rcpay_dt = Util.checkString(rset0.getString("rcpay_dt"));
			rec.rcpay_amt = Util.checkString(rset0.getString("rcpay_amt"));
			rec.dr_budg_cd = Util.checkString(rset0.getString("dr_budg_cd"));
			rec.deps_clsf_cd = Util.checkString(rset0.getString("deps_clsf_cd"));
			rec.deps_dt = Util.checkString(rset0.getString("deps_dt"));
			rec.trsfnd_slip_no = Util.checkString(rset0.getString("trsfnd_slip_no"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.extnc_ptcr = Util.checkString(rset0.getString("extnc_ptcr"));
			rec.trsfnd_slip_clsf = Util.checkString(rset0.getString("trsfnd_slip_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_1113_LDataSet ds = (FC_FUNC_1113_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1113_LCURLISTRecord curlistRec = (FC_FUNC_1113_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rcpay_dt%>
<%= curlistRec.rcpay_amt%>
<%= curlistRec.dr_budg_cd%>
<%= curlistRec.deps_clsf_cd%>
<%= curlistRec.deps_dt%>
<%= curlistRec.trsfnd_slip_no%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_no%>
<%= curlistRec.extnc_ptcr%>
<%= curlistRec.trsfnd_slip_clsf%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 26 14:11:39 KST 2009 */