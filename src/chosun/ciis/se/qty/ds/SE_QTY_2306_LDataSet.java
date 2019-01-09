/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2306_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public ArrayList commcdcur1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_QTY_2306_LDataSet(){}
	public SE_QTY_2306_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_QTY_2306_LCOMMCDCUR1Record rec = new SE_QTY_2306_LCOMMCDCUR1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.commcdcur1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			SE_QTY_2306_LCURLISTRecord rec = new SE_QTY_2306_LCURLISTRecord();
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset1.getString("medi_nm"));
			rec.sect_nm_cd = Util.checkString(rset1.getString("sect_nm_cd"));
			rec.sect_nm = Util.checkString(rset1.getString("sect_nm"));
			rec.pcnt = Util.checkString(rset1.getString("pcnt"));
			rec.clr_pcnt = Util.checkString(rset1.getString("clr_pcnt"));
			rec.add_prt_seq = Util.checkString(rset1.getString("add_prt_seq"));
			rec.prt_plac_nm = Util.checkString(rset1.getString("prt_plac_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_QTY_2306_LDataSet ds = (SE_QTY_2306_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.commcdcur1.size(); i++){
		SE_QTY_2306_LCOMMCDCUR1Record commcdcur1Rec = (SE_QTY_2306_LCOMMCDCUR1Record)ds.commcdcur1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_QTY_2306_LCURLISTRecord curlistRec = (SE_QTY_2306_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCommcdcur1()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= commcdcur1Rec.cd%>
<%= commcdcur1Rec.cdnm%>
<%= commcdcur1Rec.cd_abrv_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.sect_nm_cd%>
<%= curlistRec.sect_nm%>
<%= curlistRec.pcnt%>
<%= curlistRec.clr_pcnt%>
<%= curlistRec.add_prt_seq%>
<%= curlistRec.prt_plac_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 19 15:11:33 KST 2009 */