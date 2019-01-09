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


public class PR_OTHCNSM_2332_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_OTHCNSM_2332_LDataSet(){}
	public PR_OTHCNSM_2332_LDataSet(String errcode, String errmsg){
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
			PR_OTHCNSM_2332_LCURLISTRecord rec = new PR_OTHCNSM_2332_LCURLISTRecord();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.psplat_clsf = Util.checkString(rset0.getString("psplat_clsf"));
			rec.psplat_fee = Util.checkString(rset0.getString("psplat_fee"));
			rec.gnaw_fee = Util.checkString(rset0.getString("gnaw_fee"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.aply_dt = Util.checkString(rset0.getString("aply_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PR_OTHCNSM_2332_LDataSet ds = (PR_OTHCNSM_2332_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_OTHCNSM_2332_LCURLISTRecord curlistRec = (PR_OTHCNSM_2332_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.medi_cd%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_nm%>
<%= curlistRec.psplat_clsf%>
<%= curlistRec.psplat_fee%>
<%= curlistRec.gnaw_fee%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.aply_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Sep 24 20:18:33 KST 2009 */