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


package chosun.ciis.is.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.sal.dm.*;
import chosun.ciis.is.sal.rec.*;

/**
 * 
 */


public class IS_SAL_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_SAL_1110_LDataSet(){}
	public IS_SAL_1110_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			IS_SAL_1110_LCURLISTRecord rec = new IS_SAL_1110_LCURLISTRecord();
			rec.purc_reg_dt = Util.checkString(rset0.getString("purc_reg_dt"));
			rec.purc_reg_seq = Util.checkString(rset0.getString("purc_reg_seq"));
			rec.acwr_reg_dt = Util.checkString(rset0.getString("acwr_reg_dt"));
			rec.acwr_reg_seq = Util.checkString(rset0.getString("acwr_reg_seq"));
			rec.purc_clsf = Util.checkString(rset0.getString("purc_clsf"));
			rec.purc_clsf_nm = Util.checkString(rset0.getString("purc_clsf_nm"));
			rec.purc_dt = Util.checkString(rset0.getString("purc_dt"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.purc_amt = Util.checkString(rset0.getString("purc_amt"));
			rec.trc_yn = Util.checkString(rset0.getString("trc_yn"));
			rec.send_yn = Util.checkString(rset0.getString("send_yn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.adjm_yn = Util.checkString(rset0.getString("adjm_yn"));
			rec.purc_adjm_reg_dt = Util.checkString(rset0.getString("purc_adjm_reg_dt"));
			rec.purc_adjm_reg_seq = Util.checkString(rset0.getString("purc_adjm_reg_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_SAL_1110_LDataSet ds = (IS_SAL_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_SAL_1110_LCURLISTRecord curlistRec = (IS_SAL_1110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.purc_reg_dt%>
<%= curlistRec.purc_reg_seq%>
<%= curlistRec.acwr_reg_dt%>
<%= curlistRec.acwr_reg_seq%>
<%= curlistRec.purc_clsf%>
<%= curlistRec.purc_clsf_nm%>
<%= curlistRec.purc_dt%>
<%= curlistRec.uprc%>
<%= curlistRec.qunt%>
<%= curlistRec.purc_amt%>
<%= curlistRec.trc_yn%>
<%= curlistRec.send_yn%>
<%= curlistRec.remk%>
<%= curlistRec.adjm_yn%>
<%= curlistRec.purc_adjm_reg_dt%>
<%= curlistRec.purc_adjm_reg_seq%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 26 15:21:08 KST 2012 */