/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_1330_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_RCP_1330_LDataSet(){}
	public SE_RCP_1330_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_RCP_1330_LCURLISTRecord rec = new SE_RCP_1330_LCURLISTRecord();
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.net_sale_amt = Util.checkString(rset0.getString("net_sale_amt"));
			rec.acml_gurt_amt_stot = Util.checkString(rset0.getString("acml_gurt_amt_stot"));
			rec.sply_rem_amt = Util.checkString(rset0.getString("sply_rem_amt"));
			rec.misuamt = Util.checkString(rset0.getString("misuamt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.cntr_gurt_amt_stot = Util.checkString(rset0.getString("cntr_gurt_amt_stot"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_RCP_1330_LDataSet ds = (SE_RCP_1330_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_RCP_1330_LCURLISTRecord curlistRec = (SE_RCP_1330_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.net_sale_amt%>
<%= curlistRec.acml_gurt_amt_stot%>
<%= curlistRec.sply_rem_amt%>
<%= curlistRec.misuamt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.cntr_gurt_amt_stot%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 29 13:44:00 KST 2009 */