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


package chosun.ciis.mt.submatrcla.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 * 
 */


public class MT_SUBMATRCLA_2000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATRCLA_2000_LDataSet(){}
	public MT_SUBMATRCLA_2000_LDataSet(String errcode, String errmsg){
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
			MT_SUBMATRCLA_2000_LCURLISTRecord rec = new MT_SUBMATRCLA_2000_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.clam_actu_cd_nm = Util.checkString(rset0.getString("clam_actu_cd_nm"));
			rec.aplc_pers_nm = Util.checkString(rset0.getString("aplc_pers_nm"));
			rec.via_dept_nm = Util.checkString(rset0.getString("via_dept_nm"));
			rec.via_dept_cnfm_yn = Util.checkString(rset0.getString("via_dept_cnfm_yn"));
			rec.misno_actu = Util.checkString(rset0.getString("misno_actu"));
			rec.misno_matr = Util.checkString(rset0.getString("misno_matr"));
			rec.clam_clsf = Util.checkString(rset0.getString("clam_clsf"));
			rec.wcl_issu_yn = Util.checkString(rset0.getString("wcl_issu_yn"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.clam_actu_cd = Util.checkString(rset0.getString("clam_actu_cd"));
			rec.aplc_pers = Util.checkString(rset0.getString("aplc_pers"));
			rec.via_dept = Util.checkString(rset0.getString("via_dept"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_SUBMATRCLA_2000_LDataSet ds = (MT_SUBMATRCLA_2000_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATRCLA_2000_LCURLISTRecord curlistRec = (MT_SUBMATRCLA_2000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.occr_dt%>
<%= curlistRec.dept_cd_nm%>
<%= curlistRec.clam_actu_cd_nm%>
<%= curlistRec.aplc_pers_nm%>
<%= curlistRec.via_dept_nm%>
<%= curlistRec.via_dept_cnfm_yn%>
<%= curlistRec.misno_actu%>
<%= curlistRec.misno_matr%>
<%= curlistRec.clam_clsf%>
<%= curlistRec.wcl_issu_yn%>
<%= curlistRec.seq%>
<%= curlistRec.dept_cd%>
<%= curlistRec.clam_actu_cd%>
<%= curlistRec.aplc_pers%>
<%= curlistRec.via_dept%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 09 13:38:09 KST 2009 */