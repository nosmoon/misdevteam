/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_RCP_1410_LDataSet(){}
	public SE_RCP_1410_LDataSet(String errcode, String errmsg){
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

		ResultSet rset4 = (ResultSet) cstmt.getObject(8);
		while(rset4.next()){
			SE_RCP_1410_LCURLISTRecord rec = new SE_RCP_1410_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset4.getString("occr_dt"));
			rec.slip_clsf = Util.checkString(rset4.getString("slip_clsf"));
			rec.seq = Util.checkString(rset4.getString("seq"));
			rec.rcpm_dt = Util.checkString(rset4.getString("rcpm_dt"));
			rec.dept_nm = Util.checkString(rset4.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset4.getString("part_nm"));
			rec.area_nm = Util.checkString(rset4.getString("area_nm"));
			rec.area_cd = Util.checkString(rset4.getString("area_cd"));
			rec.bo_nm = Util.checkString(rset4.getString("bo_nm"));
			rec.cnt = Util.checkString(rset4.getString("cnt"));
			rec.actu_slip_no = Util.checkString(rset4.getString("actu_slip_no"));
			rec.acct_slip_no = Util.checkString(rset4.getString("acct_slip_no"));
			rec.rcpm_amt = Util.checkString(rset4.getString("rcpm_amt"));
			rec.clos_yn = Util.checkString(rset4.getString("clos_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_RCP_1410_LDataSet ds = (SE_RCP_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_RCP_1410_LCURLISTRecord curlistRec = (SE_RCP_1410_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.slip_clsf%>
<%= curlistRec.seq%>
<%= curlistRec.rcpm_dt%>
<%= curlistRec.dept_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.bo_nm%>
<%= curlistRec.cnt%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.acct_slip_no%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.clos_yn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Aug 14 16:15:43 KST 2009 */