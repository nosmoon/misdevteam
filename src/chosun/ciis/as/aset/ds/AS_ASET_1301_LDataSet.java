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


package chosun.ciis.as.aset.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1301_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1301_LDataSet(){}
	public AS_ASET_1301_LDataSet(String errcode, String errmsg){
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
			AS_ASET_1301_LCURLIST1Record rec = new AS_ASET_1301_LCURLIST1Record();
			rec.chg_dt = Util.checkString(rset0.getString("chg_dt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			AS_ASET_1301_LCURLIST2Record rec = new AS_ASET_1301_LCURLIST2Record();
			rec.aset_no = Util.checkString(rset1.getString("aset_no"));
			rec.aset_nm = Util.checkString(rset1.getString("aset_nm"));
			rec.befo_dept_cd = Util.checkString(rset1.getString("befo_dept_cd"));
			rec.befo_loca = Util.checkString(rset1.getString("befo_loca"));
			rec.now_dept_cd = Util.checkString(rset1.getString("now_dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.now_loca = Util.checkString(rset1.getString("now_loca"));
			rec.dtls_remk = Util.checkString(rset1.getString("dtls_remk"));
			rec.hsty_cnt = Util.checkString(rset1.getString("hsty_cnt"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.chg_clsf = Util.checkString(rset1.getString("chg_clsf"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.occr_seq = Util.checkString(rset1.getString("occr_seq"));
			rec.sub_seq = Util.checkString(rset1.getString("sub_seq"));
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AS_ASET_1301_LDataSet ds = (AS_ASET_1301_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AS_ASET_1301_LCURLIST1Record curlist1Rec = (AS_ASET_1301_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AS_ASET_1301_LCURLIST2Record curlist2Rec = (AS_ASET_1301_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.chg_dt%>
<%= curlist1Rec.remk%>
<%= curlist2Rec.aset_no%>
<%= curlist2Rec.aset_nm%>
<%= curlist2Rec.befo_dept_cd%>
<%= curlist2Rec.befo_loca%>
<%= curlist2Rec.now_dept_cd%>
<%= curlist2Rec.dept_nm%>
<%= curlist2Rec.now_loca%>
<%= curlist2Rec.dtls_remk%>
<%= curlist2Rec.hsty_cnt%>
<%= curlist2Rec.dlco_nm%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.chg_clsf%>
<%= curlist2Rec.occr_dt%>
<%= curlist2Rec.occr_seq%>
<%= curlist2Rec.sub_seq%>
<%= curlist2Rec.dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 17 14:51:07 KST 2009 */