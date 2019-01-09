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


public class FC_FUNC_3090_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_3090_LDataSet(){}
	public FC_FUNC_3090_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_FUNC_3090_LCURLISTRecord rec = new FC_FUNC_3090_LCURLISTRecord();
			rec.deps_isav_clsf_cd = Util.checkString(rset0.getString("deps_isav_clsf_cd"));
			rec.deps_isav_no = Util.checkString(rset0.getString("deps_isav_no"));
			rec.deps_isav_nm = Util.checkString(rset0.getString("deps_isav_nm"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.tot_pymt_amt = Util.checkString(rset0.getString("tot_pymt_amt"));
			rec.dlco_cd_nm = Util.checkString(rset0.getString("dlco_cd_nm"));
			rec.clsf_nm = Util.checkString(rset0.getString("clsf_nm"));
			rec.prd_from = Util.checkString(rset0.getString("prd_from"));
			rec.prd_end = Util.checkString(rset0.getString("prd_end"));
			rec.int_rate = Util.checkString(rset0.getString("int_rate"));
			rec.int_amt = Util.checkString(rset0.getString("int_amt"));
			rec.clsf = Util.checkString(rset0.getString("clsf"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_3090_LDataSet ds = (FC_FUNC_3090_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_3090_LCURLISTRecord curlistRec = (FC_FUNC_3090_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.deps_isav_clsf_cd%>
<%= curlistRec.deps_isav_no%>
<%= curlistRec.deps_isav_nm%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.tot_pymt_amt%>
<%= curlistRec.dlco_cd_nm%>
<%= curlistRec.clsf_nm%>
<%= curlistRec.prd_from%>
<%= curlistRec.prd_end%>
<%= curlistRec.int_rate%>
<%= curlistRec.int_amt%>
<%= curlistRec.clsf%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.yymm%>
<%= curlistRec.seq%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jul 14 11:49:43 KST 2009 */