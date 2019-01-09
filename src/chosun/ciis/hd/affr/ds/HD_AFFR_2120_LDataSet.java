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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_2120_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_2120_LDataSet(){}
	public HD_AFFR_2120_LDataSet(String errcode, String errmsg){
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
			HD_AFFR_2120_LCURLISTRecord rec = new HD_AFFR_2120_LCURLISTRecord();
			rec.emp_lcls_cd = Util.checkString(rset0.getString("emp_lcls_cd"));
			rec.congr_condl_cd = Util.checkString(rset0.getString("congr_condl_cd"));
			rec.congr_condl_fee = Util.checkString(rset0.getString("congr_condl_fee"));
			rec.art_flower = Util.checkString(rset0.getString("art_flower"));
			rec.ofcr_congr_condl_fee = Util.checkString(rset0.getString("ofcr_congr_condl_fee"));
			rec.ofcr_art_flower = Util.checkString(rset0.getString("ofcr_art_flower"));
			rec.aply_basi_dt = Util.checkString(rset0.getString("aply_basi_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_AFFR_2120_LDataSet ds = (HD_AFFR_2120_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_2120_LCURLISTRecord curlistRec = (HD_AFFR_2120_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.emp_lcls_cd%>
<%= curlistRec.congr_condl_cd%>
<%= curlistRec.congr_condl_fee%>
<%= curlistRec.art_flower%>
<%= curlistRec.ofcr_congr_condl_fee%>
<%= curlistRec.ofcr_art_flower%>
<%= curlistRec.aply_basi_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 20 20:12:01 KST 2009 */