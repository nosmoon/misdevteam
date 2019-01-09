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


public class MT_PAPINOUT_5300_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_fac = new ArrayList();
	public ArrayList curlist_data = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_5300_LDataSet(){}
	public MT_PAPINOUT_5300_LDataSet(String errcode, String errmsg){
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
			MT_PAPINOUT_5300_LCURLIST_DATARecord rec = new MT_PAPINOUT_5300_LCURLIST_DATARecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.pj = rset0.getDouble("pj");
			this.curlist_data.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			MT_PAPINOUT_5300_LCURLIST_FACRecord rec = new MT_PAPINOUT_5300_LCURLIST_FACRecord();
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset1.getString("fac_clsf_nm"));
			this.curlist_fac.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPINOUT_5300_LDataSet ds = (MT_PAPINOUT_5300_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist_data.size(); i++){
		MT_PAPINOUT_5300_LCURLIST_DATARecord curlist_dataRec = (MT_PAPINOUT_5300_LCURLIST_DATARecord)ds.curlist_data.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist_fac.size(); i++){
		MT_PAPINOUT_5300_LCURLIST_FACRecord curlist_facRec = (MT_PAPINOUT_5300_LCURLIST_FACRecord)ds.curlist_fac.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist_data()%>
<%= ds.getCurlist_fac()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist_dataRec.cmpy_cd%>
<%= curlist_dataRec.issu_dt%>
<%= curlist_dataRec.fac_clsf%>
<%= curlist_dataRec.pj%>
<%= curlist_facRec.fac_clsf%>
<%= curlist_facRec.fac_clsf_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 15 21:27:35 KST 2009 */