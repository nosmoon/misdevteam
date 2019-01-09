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


package chosun.ciis.pr.papmake.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_1053_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_1053_LDataSet(){}
	public PR_PAPMAKE_1053_LDataSet(String errcode, String errmsg){
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
			PR_PAPMAKE_1053_LCURLIST1Record rec = new PR_PAPMAKE_1053_LCURLIST1Record();
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PR_PAPMAKE_1053_LCURLIST2Record rec = new PR_PAPMAKE_1053_LCURLIST2Record();
			rec.matr_cd = Util.checkString(rset1.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset1.getString("matr_nm"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.use_qunt_1 = Util.checkString(rset1.getString("use_qunt_1"));
			rec.use_qunt_2 = Util.checkString(rset1.getString("use_qunt_2"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			PR_PAPMAKE_1053_LCURLIST3Record rec = new PR_PAPMAKE_1053_LCURLIST3Record();
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset2.getString("medi_nm"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PR_PAPMAKE_1053_LDataSet ds = (PR_PAPMAKE_1053_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_PAPMAKE_1053_LCURLIST1Record curlist1Rec = (PR_PAPMAKE_1053_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		PR_PAPMAKE_1053_LCURLIST2Record curlist2Rec = (PR_PAPMAKE_1053_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		PR_PAPMAKE_1053_LCURLIST3Record curlist3Rec = (PR_PAPMAKE_1053_LCURLIST3Record)ds.curlist3.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.matr_cd%>
<%= curlist1Rec.matr_nm%>
<%= curlist2Rec.matr_cd%>
<%= curlist2Rec.matr_nm%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.use_qunt_1%>
<%= curlist2Rec.use_qunt_2%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.dlco_cd%>
<%= curlist2Rec.dlco_nm%>
<%= curlist3Rec.medi_cd%>
<%= curlist3Rec.medi_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Jul 18 15:17:36 KST 2009 */