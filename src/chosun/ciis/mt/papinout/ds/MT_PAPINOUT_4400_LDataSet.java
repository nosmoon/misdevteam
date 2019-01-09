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


public class MT_PAPINOUT_4400_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_4400_LDataSet(){}
	public MT_PAPINOUT_4400_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			MT_PAPINOUT_4400_LCURLISTRecord rec = new MT_PAPINOUT_4400_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.cut_err_occr_dt = Util.checkString(rset0.getString("cut_err_occr_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_nm = Util.checkString(rset0.getString("fac_nm"));
			rec.papcmpy_cd = Util.checkString(rset0.getString("papcmpy_cd"));
			rec.papcmpy_nm = Util.checkString(rset0.getString("papcmpy_nm"));
			rec.cut_err_tms = Util.checkString(rset0.getString("cut_err_tms"));
			rec.cut_err_point = Util.checkString(rset0.getString("cut_err_point"));
			rec.cut_err_point_nm = Util.checkString(rset0.getString("cut_err_point_nm"));
			rec.cut_err_caus_prd = Util.checkString(rset0.getString("cut_err_caus_prd"));
			rec.cut_err_caus_prd_nm = Util.checkString(rset0.getString("cut_err_caus_prd_nm"));
			rec.cut_err_caus_midl = Util.checkString(rset0.getString("cut_err_caus_midl"));
			rec.cut_err_caus_midl_nm = Util.checkString(rset0.getString("cut_err_caus_midl_nm"));
			rec.cut_err_caus_plac = Util.checkString(rset0.getString("cut_err_caus_plac"));
			rec.clos_clsf = Util.checkString(rset0.getString("clos_clsf"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_PAPINOUT_4400_LDataSet ds = (MT_PAPINOUT_4400_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_4400_LCURLISTRecord curlistRec = (MT_PAPINOUT_4400_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.cut_err_occr_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.fac_nm%>
<%= curlistRec.papcmpy_cd%>
<%= curlistRec.papcmpy_nm%>
<%= curlistRec.cut_err_tms%>
<%= curlistRec.cut_err_point%>
<%= curlistRec.cut_err_point_nm%>
<%= curlistRec.cut_err_caus_prd%>
<%= curlistRec.cut_err_caus_prd_nm%>
<%= curlistRec.cut_err_caus_midl%>
<%= curlistRec.cut_err_caus_midl_nm%>
<%= curlistRec.cut_err_caus_plac%>
<%= curlistRec.clos_clsf%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 27 17:55:30 KST 2009 */