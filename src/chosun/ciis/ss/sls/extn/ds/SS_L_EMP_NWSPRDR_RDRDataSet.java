/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Ǹ�-��������-�̻絶�ڼ�����Ȳ
* �ۼ����� : 2011-12-05
* �ۼ��� : �̱⿵
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_L_EMP_NWSPRDR_RDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curempnwsp_rdrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EMP_NWSPRDR_RDRDataSet(){}
	public SS_L_EMP_NWSPRDR_RDRDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SS_L_EMP_NWSPRDR_RDRCUREMPNWSP_RDRLISTRecord rec = new SS_L_EMP_NWSPRDR_RDRCUREMPNWSP_RDRLISTRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.telno = Util.checkString(rset0.getString("telno"));
			rec.ptphno = Util.checkString(rset0.getString("ptphno"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.rdr_extnno = Util.checkString(rset0.getString("rdr_extnno"));
			rec.subsfr_dt = Util.checkString(rset0.getString("subsfr_dt"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.subsqty = Util.checkString(rset0.getString("subsqty"));
			rec.freeyn = Util.checkString(rset0.getString("freeyn"));
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.suspresncd = Util.checkString(rset0.getString("suspresncd"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			this.curempnwsp_rdrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_L_EMP_NWSPRDR_RDRDataSet ds = (SS_L_EMP_NWSPRDR_RDRDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curempnwsp_rdrlist.size(); i++){
		SS_L_EMP_NWSPRDR_RDRCUREMPNWSP_RDRLISTRecord curempnwsp_rdrlistRec = (SS_L_EMP_NWSPRDR_RDRCUREMPNWSP_RDRLISTRecord)ds.curempnwsp_rdrlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurempnwsp_rdrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curempnwsp_rdrlistRec.rdr_no%>
<%= curempnwsp_rdrlistRec.rdrnm%>
<%= curempnwsp_rdrlistRec.addr%>
<%= curempnwsp_rdrlistRec.telno%>
<%= curempnwsp_rdrlistRec.ptphno%>
<%= curempnwsp_rdrlistRec.bonm%>
<%= curempnwsp_rdrlistRec.bocd%>
<%= curempnwsp_rdrlistRec.rdr_extndt%>
<%= curempnwsp_rdrlistRec.rdr_extnno%>
<%= curempnwsp_rdrlistRec.subsfr_dt%>
<%= curempnwsp_rdrlistRec.valmm%>
<%= curempnwsp_rdrlistRec.subsqty%>
<%= curempnwsp_rdrlistRec.freeyn%>
<%= curempnwsp_rdrlistRec.suspdt%>
<%= curempnwsp_rdrlistRec.suspresncd%>
<%= curempnwsp_rdrlistRec.dlvzip%>
<%= curempnwsp_rdrlistRec.medicd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 06 10:04:19 GMT 2013 */