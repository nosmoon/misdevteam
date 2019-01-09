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


public class MT_SUBMATRCLA_3201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATRCLA_3201_LDataSet(){}
	public MT_SUBMATRCLA_3201_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			MT_SUBMATRCLA_3201_LCURLISTRecord rec = new MT_SUBMATRCLA_3201_LCURLISTRecord();
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.clam_actu_cd = Util.checkString(rset0.getString("clam_actu_cd"));
			rec.item_nm = Util.checkString(rset0.getString("item_nm"));
			rec.aplc_pers = Util.checkString(rset0.getString("aplc_pers"));
			rec.via_dept = Util.checkString(rset0.getString("via_dept"));
			rec.via_dept_cnfm_yn = Util.checkString(rset0.getString("via_dept_cnfm_yn"));
			rec.misno_actu = Util.checkString(rset0.getString("misno_actu"));
			rec.acpn_dt = Util.checkString(rset0.getString("acpn_dt"));
			rec.rid_tel_no = Util.checkString(rset0.getString("rid_tel_no"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MT_SUBMATRCLA_3201_LDataSet ds = (MT_SUBMATRCLA_3201_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATRCLA_3201_LCURLISTRecord curlistRec = (MT_SUBMATRCLA_3201_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cnt%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.dept_cd%>
<%= curlistRec.clam_actu_cd%>
<%= curlistRec.item_nm%>
<%= curlistRec.aplc_pers%>
<%= curlistRec.via_dept%>
<%= curlistRec.via_dept_cnfm_yn%>
<%= curlistRec.misno_actu%>
<%= curlistRec.acpn_dt%>
<%= curlistRec.rid_tel_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 10 15:29:41 KST 2015 */