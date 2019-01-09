/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_3751_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EVLU_3751_LDataSet(){}
	public HD_EVLU_3751_LDataSet(String errcode, String errmsg){
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
			HD_EVLU_3751_LCURLISTRecord rec = new HD_EVLU_3751_LCURLISTRecord();
			rec.evlu_clsf = Util.checkString(rset0.getString("evlu_clsf"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.evlu_pers_deci_grad_2tms = Util.checkString(rset0.getString("evlu_pers_deci_grad_2tms"));
			rec.asst_nm_korn = Util.checkString(rset0.getString("asst_nm_korn"));
			rec.evlu_opn = Util.checkString(rset0.getString("evlu_opn"));
			rec.tms1_nm_korn = Util.checkString(rset0.getString("tms1_nm_korn"));
			rec.evlu_cmpt_opn_1tms = Util.checkString(rset0.getString("evlu_cmpt_opn_1tms"));
			rec.evlu_pers_meda_opn_1tms = Util.checkString(rset0.getString("evlu_pers_meda_opn_1tms"));
			rec.tms2_nm_korn = Util.checkString(rset0.getString("tms2_nm_korn"));
			rec.evlu_pers_meda_opn_2tms = Util.checkString(rset0.getString("evlu_pers_meda_opn_2tms"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_EVLU_3751_LDataSet ds = (HD_EVLU_3751_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_3751_LCURLISTRecord curlistRec = (HD_EVLU_3751_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.evlu_clsf%>
<%= curlistRec.evlu_pers_deci_grad_2tms%>
<%= curlistRec.asst_nm_korn%>
<%= curlistRec.evlu_opn%>
<%= curlistRec.tms1_nm_korn%>
<%= curlistRec.evlu_cmpt_opn_1tms%>
<%= curlistRec.evlu_pers_meda_opn_1tms%>
<%= curlistRec.tms2_nm_korn%>
<%= curlistRec.evlu_pers_meda_opn_2tms%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 23 16:13:47 KST 2015 */