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


package chosun.ciis.mt.close.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.rec.*;

/**
 * 
 */


public class MT_CLOSE_1001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_CLOSE_1001_LDataSet(){}
	public MT_CLOSE_1001_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			MT_CLOSE_1001_LCURLISTRecord rec = new MT_CLOSE_1001_LCURLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			MT_CLOSE_1001_LCURLIST1Record rec = new MT_CLOSE_1001_LCURLIST1Record();
			rec.matr_cd = Util.checkString(rset2.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset2.getString("matr_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(6);
		while(rset3.next()){
			MT_CLOSE_1001_LCURLIST2Record rec = new MT_CLOSE_1001_LCURLIST2Record();
			rec.matr_cd = Util.checkString(rset3.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset3.getString("matr_nm"));
			this.curlist2.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(7);
		while(rset4.next()){
			MT_CLOSE_1001_LCURLIST3Record rec = new MT_CLOSE_1001_LCURLIST3Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			this.curlist3.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(8);
		while(rset5.next()){
			MT_CLOSE_1001_LCURLIST4Record rec = new MT_CLOSE_1001_LCURLIST4Record();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset5.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset5.getString("cdabrvnm_cd"));
			this.curlist4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_CLOSE_1001_LDataSet ds = (MT_CLOSE_1001_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_CLOSE_1001_LCURLISTRecord curlistRec = (MT_CLOSE_1001_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_CLOSE_1001_LCURLIST1Record curlist1Rec = (MT_CLOSE_1001_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_CLOSE_1001_LCURLIST2Record curlist2Rec = (MT_CLOSE_1001_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_CLOSE_1001_LCURLIST3Record curlist3Rec = (MT_CLOSE_1001_LCURLIST3Record)ds.curlist3.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		MT_CLOSE_1001_LCURLIST4Record curlist4Rec = (MT_CLOSE_1001_LCURLIST4Record)ds.curlist4.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= curlistRec.cdnm_cd%>
<%= curlistRec.cdabrvnm_cd%>
<%= curlist1Rec.matr_cd%>
<%= curlist1Rec.matr_nm%>
<%= curlist2Rec.matr_cd%>
<%= curlist2Rec.matr_nm%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm_cd%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cdnm%>
<%= curlist4Rec.cd_abrv_nm%>
<%= curlist4Rec.cdnm_cd%>
<%= curlist4Rec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 09 18:03:09 KST 2009 */