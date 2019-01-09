/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ��ȣ��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ad.res.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.res.rec.AD_RES_1710_LCURLISTRecord;

/**
 * 
 */


public class AD_RES_1710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_RES_1710_LDataSet(){}
	public AD_RES_1710_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			AD_RES_1710_LCURLISTRecord rec = new AD_RES_1710_LCURLISTRecord();
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.ytot_cnt = Util.checkString(rset0.getString("ytot_cnt"));
			rec.ytot_dn = Util.checkString(rset0.getString("ytot_dn"));
			rec.ytot_clr_dn = Util.checkString(rset0.getString("ytot_clr_dn"));
			rec.ytot_advt_fee = Util.checkString(rset0.getString("ytot_advt_fee"));
			rec.gtot_cnt = Util.checkString(rset0.getString("gtot_cnt"));
			rec.gtot_dn = Util.checkString(rset0.getString("gtot_dn"));
			rec.gtot_clr_dn = Util.checkString(rset0.getString("gtot_clr_dn"));
			rec.gtot_advt_fee = Util.checkString(rset0.getString("gtot_advt_fee"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_RES_1710_LDataSet ds = (AD_RES_1710_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1710_LCURLISTRecord curlistRec = (AD_RES_1710_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.ytot_cnt%>
<%= curlistRec.ytot_dn%>
<%= curlistRec.ytot_clr_dn%>
<%= curlistRec.ytot_advt_fee%>
<%= curlistRec.gtot_cnt%>
<%= curlistRec.gtot_dn%>
<%= curlistRec.gtot_clr_dn%>
<%= curlistRec.gtot_advt_fee%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 10 14:59:45 KST 2009 */