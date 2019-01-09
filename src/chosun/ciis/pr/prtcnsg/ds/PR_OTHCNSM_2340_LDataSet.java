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


package chosun.ciis.pr.prtcnsg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.rec.*;

/**
 * 
 */


public class PR_OTHCNSM_2340_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_OTHCNSM_2340_LDataSet(){}
	public PR_OTHCNSM_2340_LDataSet(String errcode, String errmsg){
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

		ResultSet rset3 = (ResultSet) cstmt.getObject(6);
		while(rset3.next()){
			PR_OTHCNSM_2340_LCURLISTRecord rec = new PR_OTHCNSM_2340_LCURLISTRecord();
			rec.aply_dt = Util.checkString(rset3.getString("aply_dt"));
			rec.fac_clsf = Util.checkString(rset3.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset3.getString("fac_clsf_nm"));
			rec.medi_cd = Util.checkString(rset3.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset3.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset3.getString("sect_nm"));
			rec.ink_matr = Util.checkString(rset3.getString("ink_matr"));
			rec.matr_nm = Util.checkString(rset3.getString("matr_nm"));
			rec.ink_uprc = Util.checkString(rset3.getString("ink_uprc"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PR_OTHCNSM_2340_LDataSet ds = (PR_OTHCNSM_2340_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_OTHCNSM_2340_LCURLISTRecord curlistRec = (PR_OTHCNSM_2340_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.aply_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_nm%>
<%= curlistRec.ink_matr%>
<%= curlistRec.matr_nm%>
<%= curlistRec.ink_uprc%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Sep 22 16:52:01 KST 2009 */