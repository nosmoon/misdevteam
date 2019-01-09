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


public class FC_FUNC_4051_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_4051_LDataSet(){}
	public FC_FUNC_4051_LDataSet(String errcode, String errmsg){
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
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_FUNC_4051_LCURLISTRecord rec = new FC_FUNC_4051_LCURLISTRecord();
			rec.mtry_dt = Util.checkString(rset2.getString("mtry_dt"));
			rec.dlco_clsf_cd = Util.checkString(rset2.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset2.getString("dlco_cd"));
			rec.curacct_clsf_cd = Util.checkString(rset2.getString("curacct_clsf_cd"));
			rec.pay_note_no = Util.checkString(rset2.getString("pay_note_no"));
			rec.note_amt = Util.checkString(rset2.getString("note_amt"));
			rec.comp_dt = Util.checkString(rset2.getString("comp_dt"));
			rec.compnm = Util.checkString(rset2.getString("compnm"));
			rec.djgbnm = Util.checkString(rset2.getString("djgbnm"));
			rec.total = Util.checkString(rset2.getString("total"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_4051_LDataSet ds = (FC_FUNC_4051_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_4051_LCURLISTRecord curlistRec = (FC_FUNC_4051_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.mtry_dt%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.curacct_clsf_cd%>
<%= curlistRec.pay_note_no%>
<%= curlistRec.note_amt%>
<%= curlistRec.comp_dt%>
<%= curlistRec.compnm%>
<%= curlistRec.djgbnm%>
<%= curlistRec.total%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Mar 07 13:17:57 KST 2009 */