/***************************************************************************************************
* ���ϸ� : .java
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


package chosun.ciis.ad.res.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.res.rec.AD_RES_1025_LCURLISTRecord;

/**
 * 
 */


public class AD_RES_1025_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_RES_1025_LDataSet(){}
	public AD_RES_1025_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AD_RES_1025_LCURLISTRecord rec = new AD_RES_1025_LCURLISTRecord();
			rec.wkdy = Util.checkString(rset0.getString("wkdy"));
			rec.bgn_side1 = Util.checkString(rset0.getString("bgn_side1"));
			rec.end_side1 = Util.checkString(rset0.getString("end_side1"));
			rec.bgn_side2 = Util.checkString(rset0.getString("bgn_side2"));
			rec.end_side2 = Util.checkString(rset0.getString("end_side2"));
			rec.bgn_side3 = Util.checkString(rset0.getString("bgn_side3"));
			rec.end_side3 = Util.checkString(rset0.getString("end_side3"));
			rec.bgn_side4 = Util.checkString(rset0.getString("bgn_side4"));
			rec.end_side4 = Util.checkString(rset0.getString("end_side4"));
			rec.bgn_side5 = Util.checkString(rset0.getString("bgn_side5"));
			rec.end_side5 = Util.checkString(rset0.getString("end_side5"));
			//rec.issu_size = Util.checkString(rset0.getString("issu_size"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_RES_1025_LDataSet ds = (AD_RES_1025_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1025_LCURLISTRecord curlistRec = (AD_RES_1025_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.wkdy%>
<%= curlistRec.bgn_side%>
<%= curlistRec.end_side%>
<%= curlistRec.issu_size%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 23 16:58:14 KST 2009 */