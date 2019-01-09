/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2580_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2580_LDataSet(){}
	public SE_SND_2580_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SE_SND_2580_LCURLISTRecord rec = new SE_SND_2580_LCURLISTRecord();
			rec.route_nm = Util.checkString(rset0.getString("route_nm"));
			rec.route_clsf_nm = Util.checkString(rset0.getString("route_clsf_nm"));
			rec.prt_plac_cd_nm = Util.checkString(rset0.getString("prt_plac_cd_nm"));
			rec.tran_cmpy_nm = Util.checkString(rset0.getString("tran_cmpy_nm"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.pay_tran_uprc = Util.checkString(rset0.getString("pay_tran_uprc"));
			rec.work_dds = Util.checkString(rset0.getString("work_dds"));
			rec.pay_tran_cost = Util.checkString(rset0.getString("pay_tran_cost"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_2580_LDataSet ds = (SE_SND_2580_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2580_LCURLISTRecord curlistRec = (SE_SND_2580_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.route_nm%>
<%= curlistRec.route_clsf_nm%>
<%= curlistRec.prt_plac_cd_nm%>
<%= curlistRec.tran_cmpy_nm%>
<%= curlistRec.acct_no%>
<%= curlistRec.pay_tran_uprc%>
<%= curlistRec.work_dds%>
<%= curlistRec.pay_tran_cost%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Aug 18 14:13:34 KST 2009 */