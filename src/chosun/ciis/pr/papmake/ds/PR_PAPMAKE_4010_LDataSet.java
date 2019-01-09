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


package chosun.ciis.pr.papmake.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_4010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_4010_LDataSet(){}
	public PR_PAPMAKE_4010_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			PR_PAPMAKE_4010_LCURLISTRecord rec = new PR_PAPMAKE_4010_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.sub_cmpy_clsf = Util.checkString(rset0.getString("sub_cmpy_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.base_prt_servcost = Util.checkString(rset0.getString("base_prt_servcost"));
			rec.addm_prt_servcost = Util.checkString(rset0.getString("addm_prt_servcost"));
			rec.sep_prt_servcost = Util.checkString(rset0.getString("sep_prt_servcost"));
			rec.total = Util.checkString(rset0.getString("total"));
			rec.base_make_servcost = Util.checkString(rset0.getString("base_make_servcost"));
			rec.addm_make_servcost = Util.checkString(rset0.getString("addm_make_servcost"));
			rec.crps_cost = Util.checkString(rset0.getString("crps_cost"));
			rec.slip_clsf = Util.checkString(rset0.getString("slip_clsf"));
			rec.slip_proc_occr_dt = Util.checkString(rset0.getString("slip_proc_occr_dt"));
			rec.slip_proc_seq = Util.checkString(rset0.getString("slip_proc_seq"));
			rec.tax_stmt_dt = Util.checkString(rset0.getString("tax_stmt_dt"));
			rec.tax_stmt_seq = Util.checkString(rset0.getString("tax_stmt_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PR_PAPMAKE_4010_LDataSet ds = (PR_PAPMAKE_4010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PAPMAKE_4010_LCURLISTRecord curlistRec = (PR_PAPMAKE_4010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.yymm%>
<%= curlistRec.sub_cmpy_clsf%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.base_prt_servcost%>
<%= curlistRec.addm_prt_servcost%>
<%= curlistRec.sep_prt_servcost%>
<%= curlistRec.total%>
<%= curlistRec.base_make_servcost%>
<%= curlistRec.addm_make_servcost%>
<%= curlistRec.slip_clsf%>
<%= curlistRec.slip_proc_occr_dt%>
<%= curlistRec.slip_proc_seq%>
<%= curlistRec.tax_stmt_dt%>
<%= curlistRec.tax_stmt_seq%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sun Jun 14 16:36:54 KST 2009 */