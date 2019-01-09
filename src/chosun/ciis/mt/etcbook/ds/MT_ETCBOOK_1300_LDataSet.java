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


package chosun.ciis.mt.etcbook.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcbook.dm.*;
import chosun.ciis.mt.etcbook.rec.*;

/**
 * 
 */


public class MT_ETCBOOK_1300_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCBOOK_1300_LDataSet(){}
	public MT_ETCBOOK_1300_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MT_ETCBOOK_1300_LCURLISTRecord rec = new MT_ETCBOOK_1300_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.subs_frdt = Util.checkString(rset0.getString("subs_frdt"));
			rec.sbend_dt = Util.checkString(rset0.getString("sbend_dt"));
			rec.book_cd = Util.checkString(rset0.getString("book_cd"));
			rec.book_nm = Util.checkString(rset0.getString("book_nm"));
			rec.qty = rset0.getInt("qty");
			rec.uprc_won = rset0.getInt("uprc_won");
			rec.curc_clsf = Util.checkString(rset0.getString("curc_clsf"));
			rec.uprc_frex = rset0.getInt("uprc_frex");
			rec.dlvs_plac = Util.checkString(rset0.getString("dlvs_plac"));
			rec.dlvs_dt = Util.checkString(rset0.getString("dlvs_dt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_ETCBOOK_1300_LDataSet ds = (MT_ETCBOOK_1300_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_ETCBOOK_1300_LCURLISTRecord curlistRec = (MT_ETCBOOK_1300_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.subs_frdt%>
<%= curlistRec.sbend_dt%>
<%= curlistRec.book_cd%>
<%= curlistRec.book_nm%>
<%= curlistRec.qty%>
<%= curlistRec.uprc_won%>
<%= curlistRec.curc_clsf%>
<%= curlistRec.uprc_frex%>
<%= curlistRec.dlvs_plac%>
<%= curlistRec.dlvs_dt%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 21 16:57:53 KST 2009 */