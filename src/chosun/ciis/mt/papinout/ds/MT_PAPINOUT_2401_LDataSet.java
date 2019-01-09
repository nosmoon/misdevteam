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


public class MT_PAPINOUT_2401_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_2401_LDataSet(){}
	public MT_PAPINOUT_2401_LDataSet(String errcode, String errmsg){
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
			MT_PAPINOUT_2401_LCURLISTRecord rec = new MT_PAPINOUT_2401_LCURLISTRecord();
			rec.title = Util.checkString(rset0.getString("title"));
			rec.jg_wt = Util.checkString(rset0.getString("jg_wt"));
			rec.purc_uprc = Util.checkString(rset0.getString("purc_uprc"));
			rec.stored_amt_nuge = Util.checkString(rset0.getString("stored_amt_nuge"));
			rec.cur_amt = Util.checkString(rset0.getString("cur_amt"));
			rec.cha_ak = Util.checkString(rset0.getString("cha_ak"));
			rec.cur_ig_roll = Util.checkString(rset0.getString("cur_ig_roll"));
			rec.cur_ig_wt = Util.checkString(rset0.getString("cur_ig_wt"));
			rec.cur_ig_amt = Util.checkString(rset0.getString("cur_ig_amt"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.grp = Util.checkString(rset0.getString("grp"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPINOUT_2401_LDataSet ds = (MT_PAPINOUT_2401_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_2401_LCURLISTRecord curlistRec = (MT_PAPINOUT_2401_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.title%>
<%= curlistRec.jg_wt%>
<%= curlistRec.purc_uprc%>
<%= curlistRec.stored_amt_nuge%>
<%= curlistRec.cur_amt%>
<%= curlistRec.cha_ak%>
<%= curlistRec.cur_ig_roll%>
<%= curlistRec.cur_ig_wt%>
<%= curlistRec.cur_ig_amt%>
<%= curlistRec.matr_cd%>
<%= curlistRec.grp%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 23 18:05:40 KST 2009 */