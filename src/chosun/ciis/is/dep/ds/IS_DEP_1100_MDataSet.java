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


package chosun.ciis.is.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_1100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_DEP_1100_MDataSet(){}
	public IS_DEP_1100_MDataSet(String errcode, String errmsg){
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
			IS_DEP_1100_MCURLISTRecord rec = new IS_DEP_1100_MCURLISTRecord();
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
	IS_DEP_1100_MDataSet ds = (IS_DEP_1100_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_DEP_1100_MCURLISTRecord curlistRec = (IS_DEP_1100_MCURLISTRecord)ds.curlist.get(i);%>
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


/* �ۼ��ð� : Thu May 17 09:52:58 KST 2012 */