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


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_2110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_2110_LDataSet(){}
	public SE_BOI_2110_LDataSet(String errcode, String errmsg){
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

		ResultSet rset11 = (ResultSet) cstmt.getObject(10);
		while(rset11.next()){
			SE_BOI_2110_LCURLISTRecord rec = new SE_BOI_2110_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset11.getString("occr_dt"));
			rec.slip_clsf = Util.checkString(rset11.getString("slip_clsf"));
			rec.seq = Util.checkString(rset11.getString("seq"));
			rec.dept_nm = Util.checkString(rset11.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset11.getString("part_nm"));
			rec.area_nm = Util.checkString(rset11.getString("area_nm"));
			rec.area_cd = Util.checkString(rset11.getString("area_cd"));
			rec.slip_no = Util.checkString(rset11.getString("slip_no"));
			rec.acct_slip_no = Util.checkString(rset11.getString("acct_slip_no"));
			rec.rcpm_amt = Util.checkString(rset11.getString("rcpm_amt"));
			rec.clos_yn = Util.checkString(rset11.getString("clos_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BOI_2110_LDataSet ds = (SE_BOI_2110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_2110_LCURLISTRecord curlistRec = (SE_BOI_2110_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.dept_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.slip_no%>
<%= curlistRec.acct_slip_no%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.clos_yn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Aug 14 16:15:43 KST 2009 */