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


package chosun.ciis.pr.prtexec.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_2009_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PRTEXEC_2009_LDataSet(){}
	public PR_PRTEXEC_2009_LDataSet(String errcode, String errmsg){
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
			PR_PRTEXEC_2009_LCURLISTRecord rec = new PR_PRTEXEC_2009_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.pcnt = Util.checkString(rset0.getString("pcnt"));
			rec.clr_pcnt = Util.checkString(rset0.getString("clr_pcnt"));
			rec.new_flag = Util.checkString(rset0.getString("new_flag"));
			rec.pcnt_2 = Util.checkString(rset0.getString("pcnt_2"));
			rec.clr_pcnt_2 = Util.checkString(rset0.getString("clr_pcnt_2"));
			rec.prt_dt = Util.checkString(rset0.getString("prt_dt"));
			rec.prt_tm = Util.checkString(rset0.getString("prt_tm"));
			rec.add_prt_seq = Util.checkString(rset0.getString("add_prt_seq"));
			rec.std = Util.checkString(rset0.getString("std"));
			rec.dual_out_clsf = Util.checkString(rset0.getString("dual_out_clsf"));
			rec.tm_in_yn = Util.checkString(rset0.getString("tm_in_yn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PR_PRTEXEC_2009_LDataSet ds = (PR_PRTEXEC_2009_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PRTEXEC_2009_LCURLISTRecord curlistRec = (PR_PRTEXEC_2009_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_nm%>
<%= curlistRec.pcnt%>
<%= curlistRec.clr_pcnt%>
<%= curlistRec.new_flag%>
<%= curlistRec.pcnt_2%>
<%= curlistRec.clr_pcnt_2%>
<%= curlistRec.prt_dt%>
<%= curlistRec.prt_tm%>
<%= curlistRec.add_prt_seq%>
<%= curlistRec.std%>
<%= curlistRec.dual_out_clsf%>
<%= curlistRec.tm_in_yn%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jul 07 21:54:17 KST 2009 */