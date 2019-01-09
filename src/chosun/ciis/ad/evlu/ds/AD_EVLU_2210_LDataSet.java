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


package chosun.ciis.ad.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.evlu.dm.*;
import chosun.ciis.ad.evlu.rec.*;

/**
 * 
 */


public class AD_EVLU_2210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_EVLU_2210_LDataSet(){}
	public AD_EVLU_2210_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			AD_EVLU_2210_LCURLISTRecord rec = new AD_EVLU_2210_LCURLISTRecord();
			rec.pubc_yyyymmdd = Util.checkString(rset0.getString("pubc_yyyymmdd"));
			rec.yoil = Util.checkString(rset0.getString("yoil"));
			rec.scorecode = Util.checkString(rset0.getString("scorecode"));
			rec.scor = Util.checkString(rset0.getString("scor"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.evlu_pers_emp_no = Util.checkString(rset0.getString("evlu_pers_emp_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_EVLU_2210_LDataSet ds = (AD_EVLU_2210_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_EVLU_2210_LCURLISTRecord curlistRec = (AD_EVLU_2210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pubc_yyyymmdd%>
<%= curlistRec.yoil%>
<%= curlistRec.scorecode%>
<%= curlistRec.scor%>
<%= curlistRec.remk%>
<%= curlistRec.evlu_pers_emp_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 22 15:16:45 KST 2010 */