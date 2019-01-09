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


package chosun.ciis.ad.dep.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.dep.rec.AD_DEP_2710_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_2710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String rcpm_frdt;
	public String rcpm_todt;

	public AD_DEP_2710_LDataSet(){}
	public AD_DEP_2710_LDataSet(String errcode, String errmsg, String rcpm_frdt, String rcpm_todt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rcpm_frdt = rcpm_frdt;
		this.rcpm_todt = rcpm_todt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRcpm_frdt(String rcpm_frdt){
		this.rcpm_frdt = rcpm_frdt;
	}

	public void setRcpm_todt(String rcpm_todt){
		this.rcpm_todt = rcpm_todt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRcpm_frdt(){
		return this.rcpm_frdt;
	}

	public String getRcpm_todt(){
		return this.rcpm_todt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.rcpm_frdt = Util.checkString(cstmt.getString(6));
		this.rcpm_todt = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			AD_DEP_2710_LCURLISTRecord rec = new AD_DEP_2710_LCURLISTRecord();
			rec.gubun = Util.checkString(rset0.getString("gubun"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.pubc_amt = Util.checkString(rset0.getString("pubc_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.tot_rcpm_amt = Util.checkString(rset0.getString("tot_rcpm_amt"));
			rec.avg_rcpm_amt = Util.checkString(rset0.getString("avg_rcpm_amt"));
			rec.lack_amt = Util.checkString(rset0.getString("lack_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_DEP_2710_LDataSet ds = (AD_DEP_2710_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_2710_LCURLISTRecord curlistRec = (AD_DEP_2710_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRcpm_frdt()%>
<%= ds.getRcpm_todt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.gubun%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.pubc_amt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.tot_rcpm_amt%>
<%= curlistRec.avg_rcpm_amt%>
<%= curlistRec.lack_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 10 13:19:50 KST 2009 */