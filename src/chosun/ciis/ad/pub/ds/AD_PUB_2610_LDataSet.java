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


package chosun.ciis.ad.pub.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.pub.rec.AD_PUB_2610_LCURLISTRecord;

/**
 * 
 */


public class AD_PUB_2610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sec_no;

	public AD_PUB_2610_LDataSet(){}
	public AD_PUB_2610_LDataSet(String errcode, String errmsg, String sec_no){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sec_no = sec_no;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSec_no(String sec_no){
		this.sec_no = sec_no;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSec_no(){
		return this.sec_no;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.sec_no = Util.checkString(cstmt.getString(9));
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			AD_PUB_2610_LCURLISTRecord rec = new AD_PUB_2610_LCURLISTRecord();
			rec.dt = Util.checkString(rset0.getString("dt"));
			rec.yoil = Util.checkString(rset0.getString("yoil"));
			rec.day_tot = Util.checkString(rset0.getString("day_tot"));
			rec.day_myun = Util.checkString(rset0.getString("day_myun"));
			rec.prv_dt = Util.checkString(rset0.getString("prv_dt"));
			rec.prv_yoil = Util.checkString(rset0.getString("prv_yoil"));
			rec.prv_day_tot = Util.checkString(rset0.getString("prv_day_tot"));
			rec.prv_day_myun = Util.checkString(rset0.getString("prv_day_myun"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_PUB_2610_LDataSet ds = (AD_PUB_2610_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_2610_LCURLISTRecord curlistRec = (AD_PUB_2610_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSec_no()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.dt%>
<%= curlistRec.yoil%>
<%= curlistRec.day_tot%>
<%= curlistRec.day_myun%>
<%= curlistRec.prv_dt%>
<%= curlistRec.prv_yoil%>
<%= curlistRec.prv_day_tot%>
<%= curlistRec.prv_day_myun%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 27 19:29:17 KST 2009 */