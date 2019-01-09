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


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_3018_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_3018_LDataSet(){}
	public MT_PAPINOUT_3018_LDataSet(String errcode, String errmsg){
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
			MT_PAPINOUT_3018_LCURLISTRecord rec = new MT_PAPINOUT_3018_LCURLISTRecord();
			rec.pj_kind = Util.checkString(rset0.getString("pj_kind"));
			rec.pj_kind_nm = Util.checkString(rset0.getString("pj_kind_nm"));
			rec.cnt00 = Util.checkString(rset0.getString("cnt00"));
			rec.wgt00 = Util.checkString(rset0.getString("wgt00"));
			rec.cnt01 = Util.checkString(rset0.getString("cnt01"));
			rec.wgt01 = Util.checkString(rset0.getString("wgt01"));
			rec.cnt02 = Util.checkString(rset0.getString("cnt02"));
			rec.wgt02 = Util.checkString(rset0.getString("wgt02"));
			rec.cnt03 = Util.checkString(rset0.getString("cnt03"));
			rec.wgt03 = Util.checkString(rset0.getString("wgt03"));
			rec.cnt04 = Util.checkString(rset0.getString("cnt04"));
			rec.wgt04 = Util.checkString(rset0.getString("wgt04"));
			rec.cnt05 = Util.checkString(rset0.getString("cnt05"));
			rec.wgt05 = Util.checkString(rset0.getString("wgt05"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPINOUT_3018_LDataSet ds = (MT_PAPINOUT_3018_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_3018_LCURLISTRecord curlistRec = (MT_PAPINOUT_3018_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pj_kind%>
<%= curlistRec.pj_kind_nm%>
<%= curlistRec.cnt00%>
<%= curlistRec.wgt00%>
<%= curlistRec.cnt01%>
<%= curlistRec.wgt01%>
<%= curlistRec.cnt02%>
<%= curlistRec.wgt02%>
<%= curlistRec.cnt03%>
<%= curlistRec.wgt03%>
<%= curlistRec.cnt04%>
<%= curlistRec.wgt04%>
<%= curlistRec.cnt05%>
<%= curlistRec.wgt05%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Feb 14 17:26:18 KST 2014 */