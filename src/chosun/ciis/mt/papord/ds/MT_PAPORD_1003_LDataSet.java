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


package chosun.ciis.mt.papord.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_1003_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPORD_1003_LDataSet(){}
	public MT_PAPORD_1003_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			MT_PAPORD_1003_LCURLISTRecord rec = new MT_PAPORD_1003_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.aply_dt = Util.checkString(rset0.getString("aply_dt"));
			rec.max_ewh_wgt = Util.checkString(rset0.getString("max_ewh_wgt"));
			rec.oth_prts_ratio = Util.checkString(rset0.getString("oth_prts_ratio"));
			rec.ewh_ratio = Util.checkString(rset0.getString("ewh_ratio"));
			rec.std_ewh_wgt = Util.checkString(rset0.getString("std_ewh_wgt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPORD_1003_LDataSet ds = (MT_PAPORD_1003_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPORD_1003_LCURLISTRecord curlistRec = (MT_PAPORD_1003_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.aply_dt%>
<%= curlistRec.max_ewh_wgt%>
<%= curlistRec.oth_prts_ratio%>
<%= curlistRec.ewh_ratio%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jul 14 01:04:58 KST 2009 */