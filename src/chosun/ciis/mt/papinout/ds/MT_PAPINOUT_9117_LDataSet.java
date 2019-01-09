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


public class MT_PAPINOUT_9117_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_9117_LDataSet(){}
	public MT_PAPINOUT_9117_LDataSet(String errcode, String errmsg){
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

		ResultSet rset7 = (ResultSet) cstmt.getObject(9);
		while(rset7.next()){
			MT_PAPINOUT_9117_LCURLIST1Record rec = new MT_PAPINOUT_9117_LCURLIST1Record();
			rec.gubun = Util.checkString(rset7.getString("gubun"));
			rec.wiibgodat = Util.checkString(rset7.getString("wiibgodat"));
			rec.wifactcd = Util.checkString(rset7.getString("wifactcd"));
			rec.wifactnm = Util.checkString(rset7.getString("wifactnm"));
			rec.wijjcd = Util.checkString(rset7.getString("wijjcd"));
			rec.jcjjcdnm = Util.checkString(rset7.getString("jcjjcdnm"));
			rec.jcjjcd = Util.checkString(rset7.getString("jcjjcd"));
			rec.wiibgoroll = Util.checkString(rset7.getString("wiibgoroll"));
			rec.wiibgowt = Util.checkString(rset7.getString("wiibgowt"));
			rec.wiibgowt_b = Util.checkString(rset7.getString("wiibgowt_b"));
			rec.wiibiyul = Util.checkString(rset7.getString("wiibiyul"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPINOUT_9117_LDataSet ds = (MT_PAPINOUT_9117_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PAPINOUT_9117_LCURLIST1Record curlist1Rec = (MT_PAPINOUT_9117_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.gubun%>
<%= curlist1Rec.wiibgodat%>
<%= curlist1Rec.wifactcd%>
<%= curlist1Rec.wifactnm%>
<%= curlist1Rec.wijjcd%>
<%= curlist1Rec.jcjjcdnm%>
<%= curlist1Rec.jcjjcd%>
<%= curlist1Rec.wiibgoroll%>
<%= curlist1Rec.wiibgowt%>
<%= curlist1Rec.wiibgowt_b%>
<%= curlist1Rec.wiibiyul%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 22 18:01:19 KST 2009 */