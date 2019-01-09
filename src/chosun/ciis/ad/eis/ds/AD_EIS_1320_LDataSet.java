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


package chosun.ciis.ad.eis.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.eis.rec.AD_EIS_1320_LCURLISTRecord;

/**
 * 
 */


public class AD_EIS_1320_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_EIS_1320_LDataSet(){}
	public AD_EIS_1320_LDataSet(String errcode, String errmsg){
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
			AD_EIS_1320_LCURLISTRecord rec = new AD_EIS_1320_LCURLISTRecord();
			rec.pubc_yy = Util.checkString(rset0.getString("pubc_yy"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.tot_pcnt = Util.checkString(rset0.getString("tot_pcnt"));
			rec.self_advt_tot = Util.checkString(rset0.getString("self_advt_tot"));
			rec.bef_advt_fee = Util.checkString(rset0.getString("bef_advt_fee"));
			rec.bef_tot_pcnt = Util.checkString(rset0.getString("bef_tot_pcnt"));
			rec.bef_self_advt_tot = Util.checkString(rset0.getString("bef_self_advt_tot"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_EIS_1320_LDataSet ds = (AD_EIS_1320_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_EIS_1320_LCURLISTRecord curlistRec = (AD_EIS_1320_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pubc_yy%>
<%= curlistRec.advt_fee%>
<%= curlistRec.tot_pcnt%>
<%= curlistRec.self_advt_tot%>
<%= curlistRec.bef_advt_fee%>
<%= curlistRec.bef_tot_pcnt%>
<%= curlistRec.bef_self_advt_tot%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jun 08 10:05:42 KST 2009 */