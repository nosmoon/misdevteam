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


public class PR_PAPMAKE_3201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_3201_LDataSet(){}
	public PR_PAPMAKE_3201_LDataSet(String errcode, String errmsg){
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
			PR_PAPMAKE_3201_LCURLISTRecord rec = new PR_PAPMAKE_3201_LCURLISTRecord();
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.film_make_fee = Util.checkString(rset0.getString("film_make_fee"));
			rec.pack_fee = Util.checkString(rset0.getString("pack_fee"));
			rec.psplat_fee_2p = Util.checkString(rset0.getString("psplat_fee_2p"));
			rec.psplat_fee_4p = Util.checkString(rset0.getString("psplat_fee_4p"));
			rec.gnaw_fee_2p = Util.checkString(rset0.getString("gnaw_fee_2p"));
			rec.gnaw_fee_4p = Util.checkString(rset0.getString("gnaw_fee_4p"));
			rec.paper_uprc = Util.checkString(rset0.getString("paper_uprc"));
			rec.paper_portage = Util.checkString(rset0.getString("paper_portage"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PR_PAPMAKE_3201_LDataSet ds = (PR_PAPMAKE_3201_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PAPMAKE_3201_LCURLISTRecord curlistRec = (PR_PAPMAKE_3201_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.film_make_fee%>
<%= curlistRec.pack_fee%>
<%= curlistRec.psplat_fee_2p%>
<%= curlistRec.psplat_fee_4p%>
<%= curlistRec.gnaw_fee_2p%>
<%= curlistRec.gnaw_fee_4p%>
<%= curlistRec.paper_uprc%>
<%= curlistRec.paper_portage%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 20 10:23:58 KST 2016 */