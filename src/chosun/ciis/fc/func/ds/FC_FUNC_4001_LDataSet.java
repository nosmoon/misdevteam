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


public class FC_FUNC_4001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_4001_LDataSet(){}
	public FC_FUNC_4001_LDataSet(String errcode, String errmsg){
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
		ResultSet rset4 = (ResultSet) cstmt.getObject(5);
		while(rset4.next()){
			FC_FUNC_4001_LCURLISTRecord rec = new FC_FUNC_4001_LCURLISTRecord();
			rec.recp_dt = Util.checkString(rset4.getString("recp_dt"));
			rec.bgn_no = Util.checkString(rset4.getString("bgn_no"));
			rec.pch_count = Util.checkString(rset4.getString("pch_count"));
			rec.curacct_clsf_cd = Util.checkString(rset4.getString("curacct_clsf_cd"));
			rec.bank_cd = Util.checkString(rset4.getString("bank_cd"));
			rec.bank_nm = Util.checkString(rset4.getString("bank_nm"));
			rec.cmpy_cd = Util.checkString(rset4.getString("cmpy_cd"));
			rec.incmg_pers = Util.checkString(rset4.getString("incmg_pers"));
			rec.incmg_pers_ipadd = Util.checkString(rset4.getString("incmg_pers_ipadd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_4001_LDataSet ds = (FC_FUNC_4001_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_4001_LCURLISTRecord curlistRec = (FC_FUNC_4001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.recp_dt%>
<%= curlistRec.bgn_no%>
<%= curlistRec.pch_count%>
<%= curlistRec.curacct_clsf_cd%>
<%= curlistRec.bank_cd%>
<%= curlistRec.bank_nm%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_pers_ipadd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 09 17:06:49 KST 2009 */