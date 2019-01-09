/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 2009-01-29
* �ۼ��� : ���±�
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
import chosun.ciis.ad.dep.rec.AD_DEP_1100_MCURLISTRecord;

/**
 * 
 */


public class AD_DEP_1100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_1100_MDataSet(){}
	public AD_DEP_1100_MDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			AD_DEP_1100_MCURLISTRecord rec = new AD_DEP_1100_MCURLISTRecord();
			rec.sun = Util.checkString(rset0.getString("sun"));
			rec.sun_yn = Util.checkString(rset0.getString("sun_yn"));
			rec.mon = Util.checkString(rset0.getString("mon"));
			rec.mon_yn = Util.checkString(rset0.getString("mon_yn"));
			rec.tue = Util.checkString(rset0.getString("tue"));
			rec.tue_yn = Util.checkString(rset0.getString("tue_yn"));
			rec.wed = Util.checkString(rset0.getString("wed"));
			rec.wed_yn = Util.checkString(rset0.getString("wed_yn"));
			rec.thr = Util.checkString(rset0.getString("thr"));
			rec.thr_yn = Util.checkString(rset0.getString("thr_yn"));
			rec.fri = Util.checkString(rset0.getString("fri"));
			rec.fri_yn = Util.checkString(rset0.getString("fri_yn"));
			rec.sat = Util.checkString(rset0.getString("sat"));
			rec.sat_yn = Util.checkString(rset0.getString("sat_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_DEP_1100_MDataSet ds = (AD_DEP_1100_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_1100_MCURLISTRecord curlistRec = (AD_DEP_1100_MCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sun%>
<%= curlistRec.sun_yn%>
<%= curlistRec.mon%>
<%= curlistRec.mon_yn%>
<%= curlistRec.tue%>
<%= curlistRec.tue_yn%>
<%= curlistRec.wed%>
<%= curlistRec.wed_yn%>
<%= curlistRec.thr%>
<%= curlistRec.thr_yn%>
<%= curlistRec.fri%>
<%= curlistRec.fri_yn%>
<%= curlistRec.sat%>
<%= curlistRec.sat_yn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 02 19:04:28 KST 2009 */